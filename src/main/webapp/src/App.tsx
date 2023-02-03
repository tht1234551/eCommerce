import 'bootstrap/scss/bootstrap.scss'
import MainPage from "./page/MainPage";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import React from "react";
import AuthContextType from "./types/AuthContextType";
import AuthService from "./services/AuthService";

function App() {
    const authService = AuthService();
    let AuthContext = React.createContext<AuthContextType>(authService);

    return (
        <BrowserRouter>
            <AuthContext.Provider value={authService}>
                <Routes>
                    <Route path="*" element={<MainPage authContext={AuthContext}/>}/>
                    <Route path="/admin" element={<div>test</div>}/>
                </Routes>
            </AuthContext.Provider>
        </BrowserRouter>
    )
}

export default App;
