import { Routes, Route } from "react-router-dom";
import MainContents from "../component/MainContents";
import Publish from "../component/Publish";
import Intro from "../component/Intro";
import Header from "../component/Header";
import Navigation from "../component/Navigation";
import Footer from "../component/Footer";
import Copyright from "../component/Copyright";
import Test from "../component/Test"

function MainPage() {
    return <>
        <Header/>
        <Intro/>
        <Navigation/>
        <Routes>
            <Route path="/" element={<MainContents />} />
            <Route path="/pub" element={<Publish />} />
            <Route path="/test" element={<Test />} />
        </Routes>
        <Footer/>
        <Copyright/>
    </>;
}

export default MainPage;
