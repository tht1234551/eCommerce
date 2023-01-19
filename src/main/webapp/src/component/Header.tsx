import logo from '../logo.svg'
function Header() {
    return <header className={"container"}>
        <div>
            <span className={"md-4"}>
                <img src={logo} className={"img-fluid"} width={150} alt="" />
            </span>
            <span>
                <input type="text"/>
            </span>
            <span>1</span>
            <span>1</span>
            <span>1</span>
        </div>
        <div>2</div>
    </header>
}

export default Header;