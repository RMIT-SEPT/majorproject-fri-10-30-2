import React, { Component } from 'react'
import logo from '../logo.svg'

export default class Navbar extends Component {
    render() {
        return (
            <header class="main-header">
            <a href ="/" class="brand-logo">
               <img src = {logo} />
               <div class= "brand-logo-name" >BookingApp</div>
            </a>
            <nav class="main-nav">
               <ul>
                    <li>
                    <a href="/contact-us" >Contact Us</a>
                    </li>
                    <li>
                    <a href="/login">Login</a>
                    </li>
               </ul>
            </nav>
            </header>
        )
    }
}
