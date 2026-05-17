import Sidebar from "../components/Sidebar"
import Navbar from "../components/Navbar"
import DashboardCard from "../components/DashboardCard"

function Dashboard() {

    const cards = [
        {
            title: "Total Products",
            value: 120
        },
        {
            title: "Orders",
            value: 53
        },
        {
            title: "Revenue",
            value: "$12,500"
        },
        {
            title: "Customers",
            value: 320
        }
    ]

    return (
        <div className="d-flex">

            <Sidebar />

            <div className="w-100">

                <Navbar />

                <div className="container mt-4">

                    <div className="row">

                        {
                            cards.map((card, index) => (
                                <div className="col-md-3 mb-3" key={index}>
                                    <DashboardCard
                                        title={card.title}
                                        value={card.value}
                                    />
                                </div>
                            ))
                        }

                    </div>

                </div>

            </div>

        </div>
    )
}

export default Dashboard