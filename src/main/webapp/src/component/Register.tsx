import {Button, Container, Form} from "react-bootstrap";
import InputGroup from 'react-bootstrap/InputGroup';

function Register() {
    return <>
        <Container>
            <Form>
                <Form.Group className="mb-3" controlId="formBasicEmail">
                    <InputGroup className="mb-3">
                        <InputGroup.Text id="basic-addon1">
                            <Form.Label>@</Form.Label>
                        </InputGroup.Text>

                        <Form.Control
                            placeholder="Username"
                            aria-label="Username"
                            aria-describedby="basic-addon1"
                        />
                    </InputGroup>
                </Form.Group>

                <Form.Group className="mb-3" controlId="formBasicPassword">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password"/>
                </Form.Group>

                <Button variant="primary" type="submit">
                    Submit
                </Button>
            </Form>
        </Container>
    </>
}

export default Register;