import {Nav} from "react-bootstrap";
import {LinkContainer} from 'react-router-bootstrap';

function Navigation() {
    return <Nav
        defaultActiveKey="/"
    >
        <Nav.Item>
            <LinkContainer to="/">
                <Nav.Link>Home</Nav.Link>
            </LinkContainer>
        </Nav.Item>
        <Nav.Item>
            <LinkContainer to="/pub">
                <Nav.Link>publish</Nav.Link>
            </LinkContainer>
        </Nav.Item>
    </Nav>
}

export default Navigation;