import './App.css';
import React, { useState, useEffect, useRef, useCallback } from 'react'
import useBookSearch from './useBookSearch';
import useOnScreen from './hooks/useOnScreen';
import debounce from 'lodash.debounce';
import { Route, Switch, useHistory } from "react-router-dom";
import Page from './Page'



export default function App() {
  
    
    const history = useHistory();
    

    function handleClick() {
      history.push("/page");
    }

    // return (<h1>AAAA</h1>)

     return (

      <Switch>
        <Route exact path='/'>
          <button type="button" onClick={handleClick}>
            Go home
          </button>
        </Route>

        <Route exact path='/page'>
          <Page/>
        </Route>

      </Switch>

    );
  
}

