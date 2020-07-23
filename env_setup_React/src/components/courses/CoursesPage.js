import React from 'react'


// Class Component
class CoursesPage extends React.Component {
    state = {
            course: {
                title: ''
            }
        }
    
    // Arrow functions inherit the binding context of their enclosing scope
    handleChange = event => {
        // Make new shallow state, title set by the value
        const course = {...this.state.course, title: event.target.value};
        // Object short hand syntax: they're the same so just same name
        this.setState({ course });
    }

    handleSubmit = event => {
        event.preventDefault();
        alert(this.state.course.title);
    }
    
    render() {
        return (
            <form onSubmit={this.handleSubmit}>
                <h2>Courses</h2>
                <h3>Add Courses</h3>
                <input type='text' onChange={this.handleChange} value={this.state.course.title}/>
                <input type='submit' value-='Save'/>    
            </form>
        )
    }
}

export default CoursesPage;