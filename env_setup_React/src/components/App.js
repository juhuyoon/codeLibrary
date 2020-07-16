import React from 'react';
import { Route, Switch } from 'react-router-dom';
import HomePage from './home/HomePage';
import AboutPage from './about/AboutPage';
import Header from './common/header';
import PageNotFound from './PageNotFound';
import CoursesPage from './courses/CoursesPage';
function App() {
    return (
        <div className='container-fluid'>
            {/* By declaring above Route component, this will always render */}
            <Header /> 
            <Switch>
                <Route exact path='/' component={HomePage} />
                <Route path='/about' component={AboutPage} />
                <Route path='/courses' component={CoursesPage} />
                <Route component={PageNotFound} />
            </Switch>
        </div>
    )
}

export default App;