import logo from '../logo.svg'
import {BsSearch, BsPerson} from 'react-icons/bs'
import {Link} from "react-router-dom";
import {LinkContainer} from "react-router-bootstrap";
import {Nav, Container, Row, Col} from "react-bootstrap";

function Header() {
    const navList = [
        {title: 'Home', link: '/'},
        {title: 'Pub', link: '/pub'},
        {title: 'Test', link: '/test'},
    ];


    return (
        <header>
            <Container>
                <Row>
                    <Row className="align-items-center">
                        <Col xs={2} lg={2}>
                            <img src={logo} className="img-fluid" width={150} alt=""/>
                        </Col>
                        <Col xs={10} lg={7}>
                            <div className="input-group">
                                <input type="text" className="form-control" placeholder="Find your item"/>
                                <div className="input-group-append">
                                    <button className="btn btn-primary" type="button">
                                        <BsSearch/>
                                    </button>
                                </div>
                            </div>
                        </Col>
                        <Col lg={3}>
                            <div className="row">
                                <ul className="nav nav-pills text-small" style={{paddingRight: 0}}>
                                    {navList.map(({title, link}) =>
                                        <li className="col-12 col-md-auto">
                                            <Link to={link} className="nav-link text-secondary">
                                                <BsPerson className="d-block mx-auto" size="1.5rem"/>
                                                {title}
                                            </Link>

                                        </li>
                                    )}

                                </ul>
                            </div>
                        </Col>
                    </Row>
                </Row>
                <Row>2</Row>
            </Container>
        </header>
    )
}

export default Header;