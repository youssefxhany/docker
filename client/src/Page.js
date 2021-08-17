import './App.css';
import React, { useState, useEffect, useRef, useCallback } from 'react'
import useBookSearch from './useBookSearch';
import useOnScreen from './hooks/useOnScreen';
import debounce from 'lodash.debounce';


var id = 1

export default function Page() {
  
    const {greetings, getNewGreetings} = useBookSearch();
    const [isFetching, setIsFetching] = useState(false);

    const [endList, setEndList] = useState(false);

    useEffect(() => {
        window.addEventListener('scroll', debounce(handleScroll, 500));
        getNewGreetings(id)
        id = id + 8
    }, [])

    useEffect(() => {
        if (isFetching){
            setIsFetching(false)
            getNewGreetings(id).then(
                res => setEndList(res)
            )
            id = id + 8
        }

    }, [isFetching])

    const handleScroll = () => {
      if (window.innerHeight + Math.ceil(document.documentElement.scrollTop) < document.documentElement.offsetHeight) return;
      setIsFetching(true)
    }

  return (
    <>
      {/* <button onClick={getNewGreetings}>Get new greetingss</button>*/ }

      <ul>
        {
          greetings.map((greeting, i) => {

              return (
              <li key={i}>
                {greeting._greeting_message} <br />
                {greeting._greeting_receiver_name} <br />
                {greeting._greeting_sender_name} <br />
                {greeting._greeting_id} <br />
              </li>
              )
            }

          )

        }
      </ul>

      { endList && <h1>"End of list"</h1> }

    </>
  )
}

