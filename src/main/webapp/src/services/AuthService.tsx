import AuthContextType from "../types/AuthContextType";
import {useCallback, useState} from "react";
import axios from "axios";
import qs from "qs";
import {ParamsSerializerOptions} from "axios";

axios.defaults.paramsSerializer = {
    serialize :
        (params: Record<string, any>, options?: ParamsSerializerOptions) => qs.stringify(params)
}


function AuthService(): AuthContextType {
    const [user, setUser] = useState<any>(null);

    const signIn = useCallback(async (email: string, password: string) => {
        const response = await axios.get("/login",{},);
        setUser(response.data);

        return response;
    }, []);

    const signOut = useCallback(() => axios.get("/logout"), [])

    return {signIn, signOut, user}
}

export default AuthService;