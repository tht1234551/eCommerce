import { Routes, Route } from "react-router-dom";
import MainContents from "../component/MainContents";
import Publish from "../component/Publish";
import Intro from "../component/Intro";
import Header from "../component/Header";
import Navigation from "../component/Navigation";
import Footer from "../component/Footer";
import Copyright from "../component/Copyright";

function MainPage() {
    return <>
        <Header/>
        <Intro/>
        <Navigation/>
        <Routes>
            <Route path="/" element={<MainContents />} />
            <Route path="/pub" element={<Publish />} />
        </Routes>
        <Footer/>
        <Copyright/>
    </>;
}

export default MainPage;
