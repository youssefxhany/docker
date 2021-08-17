import { useEffect, useState } from 'react'
import axios from 'axios'


export default function useBookSearch() {

    const [greetings, setGreetings] = useState([])
    //const [count, setCount] = useState(0)

    const getGreetingsCount = () => {

        var requestOptions = {
            method: 'GET',
            redirect: 'follow'
        };

        return fetch("http://localhost:8080/greetings/get_count", requestOptions)
            .then(response => response.json())
    }

    const getNewGreetings = (id) => {
        return getGreetingsCount()
            .then(c => {
                if (id <= c) {
                    axios({
                        method: 'GET',
                        url: 'http://localhost:8080/greetings/push/' + id,
                    }).then(res => setGreetings(greetings.concat(res.data)), console.log(id))
                    return false;
                } else {
                    return true;
                }
            })

    }

    return { greetings, getNewGreetings }
}
