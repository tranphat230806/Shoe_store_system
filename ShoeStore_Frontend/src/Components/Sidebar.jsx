import { Link } from "react-router-dom"

function Sidebar() {

    return (
        <div
            className="bg-dark text-white p-3"
            style={{
                width: "250px",
                minHeight: "100vh"
            }}
        >

            <h3 className="mb-4">Shoe Store</h3>

            <ul className="list-unstyled">

                <li className="mb-3">
                    <Link className="text-white text-decoration-none" to="/">
                        Dashboard
                    </Link>
                </li>

                <li className="mb-3">
                    <Link className="text-white text-decoration-none" to="/products">
                        Products
                    </Link>
                </li>

                <li className="mb-3">
                    <Link className="text-white text-decoration-none" to="/orders">
                        Orders
                    </Link>
                </li>

            </ul>

        </div>
    )
}

export default Sidebar