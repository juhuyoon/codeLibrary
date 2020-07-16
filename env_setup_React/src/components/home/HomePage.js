import React from 'react';
import { Link } from 'react-router-dom';

const HomePage = () => (
    <div className='jumbotron'>
        <h1>Todo App </h1>
        <p>Reat, Redux for Progressive Web Apps</p>
        <Link to='about' className='btn btn-primary btn-lg'>
            About
        </Link>
    </div>
)

export default HomePage;