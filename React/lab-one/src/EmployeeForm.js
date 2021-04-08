import React from 'react';

export default class EmployeeForm extends React.Component {

    constructor(props){

        super(props);
        this.state = {

            id:'',
            empname:'',
            salary: 0,
            department:''

        };

        this.handleSubmit = this.handleSubmit.bind(this);

    }
    
    handleSubmit(event) {

        event.preventDefault();
        const form = event.target;
        const id = form.elements["id"].value;
        const empname = form.elements["empname"].value;
        const salary = form.elements["salary"].value;
        const department = form.elements["department"].value;
        this.props.addEmployee(id, empname, salary, department);
        form.reset();
        
    }

    render() {
        return (    
            <div>   
            <form onSubmit={this.handleSubmit}>

                <label>ID: <input type="text" name="id"/>
                </label><br></br>
                <br></br><label>Name: <input type="text" name="empname"/>
                </label><br></br>
                <br></br><label>Salary: <input type="number" name="salary"/>
                </label><br></br>
                <br></br><label>Department: <input type="text" name="department"/>
                </label><br></br>
                <br></br><input type="submit" value="Submit" />
            </form>
            </div>
        )
    }
}