// import React from 'react';
import React,{ Component } from 'react';
import { Card, CardImg, CardText, CardBody,
  CardTitle, CardSubtitle, Button } from 'reactstrap';

// const StudyInfoCard = (props) => {
class StudyInfoCard extends Component {
  render(){
    return (
      <div>
        <Card>
          <CardImg top width="100%" src={this.props.imgSrc} alt={this.props.imgAlt} />
          <CardBody>
            <CardTitle>{this.props.title}</CardTitle>
            <CardSubtitle>{this.props.subTitle}</CardSubtitle>
            <CardText>{this.props.cardText}</CardText>
            <Button>{this.props.btnText}</Button>
          </CardBody>
        </Card>
      </div>
    );
  };
}
StudyInfoCard.defaultProps = {
  title: 'Card title',
  subTitle: 'Card subtitle',
  cardText: 'Card Text',
  btnText: 'Button',
  imgSrc: 'https://placeholdit.imgix.net/~text?txtsize=33&txt=318%C3%97180&w=318&h=180',
  imgAlt: 'Image Text'
};

export default StudyInfoCard;