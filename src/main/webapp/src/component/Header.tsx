import logo from '../logo.svg'
import {BsSearch, BsPerson, BsCart, BsClockHistory} from 'react-icons/bs'
import {LinkContainer} from "react-router-bootstrap";
import {Nav, Container, Row, Col, Button} from "react-bootstrap";
import React, {useCallback, useEffect, useState} from "react";
import {useNavigate} from "react-router-dom";

function Header() {
    const [isLogin, setIsLogin] = useState<boolean>(false);

    const navs : Array<{title: string, to: string, icon: JSX.Element}> = [
        {title: 'My', to: '/my', icon: <BsPerson className="d-block mx-auto" size="1.5rem"/>},
        {title: 'History', to: '/history', icon: <BsClockHistory className="d-block mx-auto" size="1.5rem"/>},
        {title: 'Cart', to: '/cart', icon: <BsCart className="d-block mx-auto" size="1.5rem"/>},
    ];

    return (
        <Container as="header">
            <Row>
                <Row className="align-items-center">
                    <Col xs={2} lg={2}>
                        <a href="/">
                            <img src={logo} className="img-fluid" width={150} alt=""/>
                        </a>
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
                            {/* nav-pills 현재 url 색채우기 */}
                            <Nav className="{/*nav-pills*/} text-small d-flex align-items-center">
                                <Row>
                                    {navs.map(({title, to, icon})=>
                                        <Col /*xs={12} */ lg={4} key={to}>
                                            <LinkContainer to={to} className="flex-shrink-0">
                                                <Nav.Link>
                                                    <div className="flex-shrink-0">
                                                        {icon}
                                                    </div>
                                                </Nav.Link>
                                            </LinkContainer>
                                        </Col>
                                    )}
                                </Row>
                            </Nav>

                            {/*<ul className="nav nav-pills text-small" style={{paddingRight: 0}}>*/}
                            {/*    {navs.map(({title, to}) =>*/}
                            {/*        <li key={to} className="col-12 col-md-auto">*/}
                            {/*            <Link to={to} className="nav-link text-secondary">*/}
                            {/*                <BsPerson className="d-block mx-auto" size="1.5rem"/>*/}
                            {/*                {title}*/}
                            {/*            </Link>*/}
                            {/*        </li>*/}
                            {/*    )}*/}
                            {/*</ul>*/}
                        </Row>
                    </Col>
                </Row>
            </Row>
            <Row>header below contents</Row>
        </Container>
    )
}

export default Header;