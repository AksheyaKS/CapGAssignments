import logo from './logo.svg';
import './App.css';
import Employee from './Employee';
import AddEmployee from './AddEmployee';
import RegisterForm from './RegisterForm';

export default function App() {
  return (
    <div className="App">
      <h2>Add Employee</h2>
      <Employee/><br></br>
      <h2>Employee Details</h2>
      <AddEmployee/><br></br>
      <h2>Register Product Form</h2>
      <RegisterForm/><br></br>
    </div>
  );
}
