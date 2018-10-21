// import React from "react";
import React, { Component } from 'react';
import StudyInfoCard from "../components/StudyInfoCard";
import HeaderSection from "../components/HeaderSection";
import { Container, Row, Col } from "reactstrap";
import StudyInfoCardList from "../components/StudyInfoCardList";

//const Home = () => {
class Home extends Component { 
 state = {
    information: [
      {
        title: 'Card title',
        subTitle: 'Card subtitle',
        cardText: 'Card Text',
        btnText: 'Button',
        imgSrc: 'https://placeholdit.imgix.net/~text?txtsize=33&txt=318%C3%97180&w=318&h=180',
        imgAlt: 'Image Text'
      },
      {
        title: 'Card title',
        subTitle: 'Card subtitle',
        cardText: 'Card Text',
        btnText: 'Button',
        imgSrc: 'https://placeholdit.imgix.net/~text?txtsize=33&txt=318%C3%97180&w=318&h=180',
        imgAlt: 'Image Text'
      },
      {
        title: 'Card title',
        subTitle: 'Card subtitle',
        cardText: 'Card Text',
        btnText: 'Button',
        imgSrc: 'https://placeholdit.imgix.net/~text?txtsize=33&txt=318%C3%97180&w=318&h=180',
        imgAlt: 'Image Text'
      },
      {
        title: 'Card title',
        subTitle: 'Card subtitle',
        cardText: 'Card Text',
        btnText: 'Button',
        imgSrc: 'https://placeholdit.imgix.net/~text?txtsize=33&txt=318%C3%97180&w=318&h=180',
        imgAlt: 'Image Text'
      }
    ]
  }

  render(){
    return ( 
    <div>
      <header>
        <HeaderSection />
      </header>
      <div>
        <h1 class="my-4">Welcome to Modern Business</h1>
        <StudyInfoCardList data={this.state.information} />
      </div>
    </div>
    );
  } 
}

export default Home;
