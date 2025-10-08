import React, { useState, useEffect } from "react";
import axios from "axios";

const App = () => {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);
  const [refresh, setRefresh] = useState(0); // trigger updates

  // Fetch users using fetch API
  const fetchUsersWithFetch = async () => {
    setLoading(true);
    setError(null);
    try {
      const response = await fetch("https://jsonplaceholder.typicode.com/users");
      if (!response.ok) throw new Error("Network response was not ok");
      const data = await response.json();
      setUsers(data);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  // Fetch users using axios
  const fetchUsersWithAxios = async () => {
    setLoading(true);
    setError(null);
    try {
      const response = await axios.get("https://jsonplaceholder.typicode.com/users");
      setUsers(response.data);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  // useEffect simulates component lifecycle
  useEffect(() => {
    console.log("Component mounted or updated");
    fetchUsersWithFetch(); // or fetchUsersWithAxios()

    return () => {
      console.log("Component will unmount");
    };
  }, [refresh]);

  return (
    <div className="p-6 max-w-3xl mx-auto">
      <h1 className="text-3xl font-bold mb-4 text-center">Users Dashboard</h1>

      <div className="text-center mb-6">
        <button
          className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600"
          onClick={() => setRefresh(prev => prev + 1)}
        >
          Refresh Users
        </button>
      </div>

      {loading && <p className="text-center text-gray-500">Loading users...</p>}
      {error && <p className="text-center text-red-500">Error: {error}</p>}

      {!loading && !error && (
        <ul className="grid grid-cols-1 md:grid-cols-2 gap-4">
          {users.map(user => (
            <li key={user.id} className="border p-4 rounded shadow hover:shadow-lg transition">
              <p className="font-semibold text-lg">{user.name}</p>
              <p className="text-gray-700">{user.email}</p>
              <p className="text-gray-700">{user.phone}</p>
              <p className="text-gray-500 text-sm">{user.website}</p>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default App;
