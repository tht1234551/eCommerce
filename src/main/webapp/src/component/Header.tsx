import logo from '../logo.svg'
import {BsSearch, BsPerson} from 'react-icons/bs'
import {Link} from "react-router-dom";
import {LinkContainer} from "react-router-bootstrap";
import {Nav, Container, Row, Col, Button} from "react-bootstrap";

function Header() {
    type nav = {
        title: string;
        to: string;
    }

    const navs : nav[] = [
        {title: 'Home', to: '/'},
        {title: 'Pub', to: '/pub'},
        {title: 'Test', to: '/test'},
    ];


    return (
        <Container as="header">
            <Row>
                <Row className="align-items-center">
                    <Col xs={2} lg={2}>
                        <img src={logo} className="img-fluid" width={150} alt=""/>
                    </Col>
                    <Col xs={10} lg={7}>
                        <div className="input-group">
                            <input type="text" className="form-control" placeholder="Find your item"/>
                            <div className="input-group-append">
                                <Button variant="primary">
                                    <BsSearch/>
                                </Button>
                            </div>
                        </div>
                    </Col>
                    <Col lg={3}>
                        <Row>
                            <ul className="nav nav-pills text-small" style={{paddingRight: 0}}>
                                {navs.map(({title, to}) =>
                                    <li key={to} className="col-12 col-md-auto">
                                        <Link to={to} className="nav-link text-secondary">
                                            <BsPerson className="d-block mx-auto" size="1.5rem"/>
                                            {title}
                                        </Link>
                                    </li>
                                )}
                            </ul>
                        </Row>
                    </Col>
                </Row>
            </Row>
            <Row>2</Row>
        </Container>
    )
}

export default Header;