import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard</h1>
                <div className="row">
                    <div className="col">
                        <h5>Todas as vendas</h5>
                        <BarChart />
                    </div>
                    <div className="col">
                        <h5>Todas as vendas</h5>
                        <DonutChart />
                    </div>
                </div>
                <div className="py-3">
                    <h2>Todas as vendas</h2>
                </div>
                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;