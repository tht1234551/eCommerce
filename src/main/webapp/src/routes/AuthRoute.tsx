import Login from "../component/Login";
import {Route} from "react-router-dom";
import {RouteProps} from "react-router/dist/lib/components";
import * as React from "react";

function AuthRoute (_props: RouteProps):React.ReactElement {
    let isLogin = false;
    if (isLogin) {
        return <Route path="my" element={<Login/>}/>
    } else {
        return <Route path="my" element={<Login/>}/>
    }

}

export default AuthRoute;