using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DemoNETWSClient
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnProcesar_Click(object sender, EventArgs e)
        {

            ServiceReference1.MateServiceClient soap;
            soap = new ServiceReference1.MateServiceClient();

            int n1 = int.Parse(txtNum1.Text);
            int n2 = int.Parse(txtNum2.Text);

            int suma = soap.sumar(n1, n2);
            int resta = soap.restar(n1, n2);

            lblSuma.Text = "SUMA: " + suma;
            lblResta.Text = "RESTA: " + resta;

        }
    }
}
