import React from 'react';
import EmployeeForm from './EmployeeForm';

export default class AddEmployee extends React.Component {

    constructor(props){

        super(props);
        this.state = {

            employees: []

        };

        this.addEmployee = this.addEmployee.bind(this);

    }

    addEmployee(id, empname, salary, department){

        this.setState(prevState => ({
            employees: [...prevState.employees, { id, empname, salary, department}]
          }));

    }

    render(){

        return(

            <div>
                <EmployeeForm addEmployee={this.addEmployee} /><br></br>
                <table border="1" align="center">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Salary</th>
                            <th>Department</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state.employees.map((employees, index) => {

                            return (
                                <tr>
                                    <td>{employees.id}</td>
                                    <td>{employees.empname}</td>
                                    <td>{employees.salary}</td>
                                    <td>{employees.department}</td>
                                </tr>
                            );
                        })}
                    </tbody>
                </table>
            </div>

        )

    }

}