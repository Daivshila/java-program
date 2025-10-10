import clsx from "clsx";

export default function Button({ children, variant = "primary", onClick }) {
  const base = "px-4 py-2 rounded font-medium transition";
  const styles = {
    primary: "bg-primary text-white hover:bg-blue-700",
    secondary: "bg-gray-200 text-gray-800 hover:bg-gray-300 dark:bg-gray-700 dark:text-white",
  };

  return (
    <button onClick={onClick} className={clsx(base, styles[variant])}>
      {children}
    </button>
  );
}
