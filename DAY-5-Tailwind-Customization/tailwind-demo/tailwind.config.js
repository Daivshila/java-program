/** @type {import('tailwindcss').Config} */
export default {
  darkMode: 'class', // enable dark mode
  content: ['./index.html', './src/**/*.{js,ts,jsx,tsx}'],
  theme: {
    extend: {
      colors: {
        primary: '#2563eb', // custom blue
        secondary: '#9333ea', // custom purple
      },
    },
  },
  plugins: [],
};
