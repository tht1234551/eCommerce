import {AxiosResponse} from "axios";

interface AuthContextType {
    user: any;
    signIn: (email: string, password: string) => Promise<AxiosResponse<any, any>>;
    signOut: (callback: VoidFunction) => void;
}

export default AuthContextType;