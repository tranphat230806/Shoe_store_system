import { BrowserRouter, Routes, Route } from "react-router-dom"
import Dashboard from "../pages/Dashboard"
import Products from "../pages/Products"
import Orders from "../pages/Orders"

function AppRoutes() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Dashboard />} />
                <Route path="/products" element={<Products />} />
                <Route path="/orders" element={<Orders />} />
            </Routes>
        </BrowserRouter>
    )
}

export default AppRoutes