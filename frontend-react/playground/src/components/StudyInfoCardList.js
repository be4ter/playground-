import React, { Component } from 'react';
import StudyInfoCard from './StudyInfoCard';
import { Container } from 'reactstrap';

class StudyInfoCardList extends Component {
  static defaultProps = {
    data: []
  }

  render() {
    const { data } = this.props;
    const list = data.map(
      info => (
      <StudyInfoCard title={info.title} subTitle={info.subTitle} 
                              cardText={info.cardText} btnText={info.btnText}
                              imgSrc={info.imgSrc} imgAlt={info.imgAlt} />)
    );

    return (
      <div>
      <Container>
        {list}    
      </Container>
      </div>
    );
  }
}

export default StudyInfoCardList;