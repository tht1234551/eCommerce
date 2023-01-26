import {Routes, Route} from "react-router-dom";
import MainContents from "../component/MainContents";
import Publish from "../component/Publish";
import Intro from "../component/Intro";
import Header from "../component/Header";
import Navigation from "../component/Navigation";
import Footer from "../component/Footer";
import Copyright from "../component/Copyright";
import Test from "../component/Test"
import NotFound from "./NotFound";
import Login from "../component/Login";
import AuthRoute from "../routes/AuthRoute";

function MainPage() {

    return <>
        <Header/>
        {/*<Navigation/>*/}
        <Routes>
            <Route index element={
                <>
                    <Intro/>
                    <MainContents/>
                </>
            }/>

            <Route path="my" element={<Login/>}/>
            <Route path="history" element={<Login/>}/>
            <Route path="cart" element={<Login/>}/>
            <Route path="login" element={<Login/>}/>
            <Route path="pub" element={<Publish/>}/>
            <Route path="test" element={<Test/>}/>
            <Route path="*" element={<NotFound/>}/>
        </Routes>
        <Footer/>
        <Copyright/>
    </>;
}

export default MainPage;
