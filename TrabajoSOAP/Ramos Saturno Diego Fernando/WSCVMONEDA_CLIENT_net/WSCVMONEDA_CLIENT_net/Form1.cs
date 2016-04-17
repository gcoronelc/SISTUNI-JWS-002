using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WSCVMONEDA_CLIENT_net
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            CVMonedaService.CVMonedaServiceClient soap;
            soap = new CVMonedaService.CVMonedaServiceClient();

            double n1 = int.Parse(txtCantidad.Text);
            double resultado = soap.dollarToEuro(n1);



            txtResultado.Text = "" + resultado;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            CVMonedaService.CVMonedaServiceClient soap;
            soap = new CVMonedaService.CVMonedaServiceClient();

            double n2 = int.Parse(txtCantidad2.Text);
            double resultado2 = soap.dollarToSol(n2);

            txtResultado2.Text = "" + resultado2;
        }
    }
}
