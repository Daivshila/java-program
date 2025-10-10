import { useState } from "react";
import Button from "./components/Button";
import Card from "./components/Card";
import Modal from "./components/Modal";

function App() {
  const [darkMode, setDarkMode] = useState(false);
  const [modalOpen, setModalOpen] = useState(false);

  return (
    <div className={darkMode ? "dark min-h-screen p-8" : "min-h-screen p-8"}>
      <div className="flex justify-between items-center mb-6">
        <h1 className="text-3xl font-bold">Tailwind Demo</h1>
        <Button variant="secondary" onClick={() => setDarkMode(!darkMode)}>
          Toggle {darkMode ? "Light" : "Dark"} Mode
        </Button>
      </div>

      <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-6">
        <Card title="Card 1">
          <p>This is a responsive card using Tailwind Grid.</p>
        </Card>
        <Card title="Card 2">
          <p>It works great with light and dark mode.</p>
        </Card>
        <Card title="Card 3">
          <Button onClick={() => setModalOpen(true)}>Open Modal</Button>
        </Card>
      </div>

      <Modal open={modalOpen} onClose={() => setModalOpen(false)}>
        <h3 className="text-xl font-bold mb-2">Hello from Modal!</h3>
        <p>This modal uses reusable Tailwind components.</p>
      </Modal>
    </div>
  );
}

export default App;
