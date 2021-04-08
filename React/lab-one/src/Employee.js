import React from 'react';

export default class Employee extends React.Component {

    constructor(props){

        super(props);
        this.state = {

            id:'',
            name:'',
            salary: 0,
            department:''

        };

        this.handleInput = this.handleInput.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);

    }

    handleInput(event) {

        this.setState({
            [event.target.name]:event.target.value
        });

    }
    
    handleSubmit(event) {

        alert(this.state.id + " " + this.state.name + " " + this.state.salary + " " + this.state.department);
        
    }

    render() {
        return (    
            <div>   
            <form onSubmit={this.handleSubmit}>

                <label>ID: <input type="text" name="id" value={this.state.id} onChange={this.handleInput}/>
                </label><br></br>
                <br></br><label>Name: <input type="text" name="name" value={this.state.name} onChange={this.handleInput}/>
                </label><br></br>
                <br></br><label>Salary: <input type="number" name="salary" value={this.state.salary} onChange={this.handleInput}/>
                </label><br></br>
                <br></br><label>Department: <input type="text" name="department" value={this.state.department} onChange={this.handleInput}/>
                </label><br></br>
                <br></br><input type="submit" value="Submit" />

            </form>
            <h4>ID: {this.state.id}</h4>
            <h4>Name: {this.state.name}</h4>
            <h4>Salary: {this.state.salary}</h4>
            <h4>Department: {this.state.department}</h4>
            </div>     
        );
    }

}