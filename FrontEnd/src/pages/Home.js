import React, { Component } from 'react'

export default class Home extends Component {
    render() {
        return (
            <div>
            <section class="home-main-section">
            <div>
            <h1 class="title">General Booking Services</h1>
            <span class="subtitle">Book your favourite service today!
            </span>
            <a href = "/booking" class="btn">Book Now</a>
            </div>
          </section>
          <div class ="home-page-circle-1"></div>
          <div class ="home-page-circle-2"></div>
          <div class ="home-page-circle-3"></div>
          </div>
        )
    }
}
