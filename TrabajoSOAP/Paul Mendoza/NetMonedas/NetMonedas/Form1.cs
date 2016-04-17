using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Autor: Paul Mendoza Gamboa
namespace NetMonedas
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            

            if (cmbConversion.SelectedIndex > -1)
            {
                ServiceReference1.ConvertirWSClient soap;
                soap = new ServiceReference1.ConvertirWSClient();

                lblerror.Text = "";
                double monto;
                int indicecmb;
                double resultado;

                indicecmb = cmbConversion.SelectedIndex;
                monto = double.Parse(txtMonto.Text);
                
                switch (indicecmb)
                {
                    case 0:                        
                        //lblimprimir.Text = "escogiste soles a dolares";
                        lblimprimir.Text = "El equivalente en Dolares es: ";
                        resultado = soap.sol_dolar(monto);
                        txtResultado.Text = "" + Math.Round(resultado, 2);
                        break;
                    case 1:
                        //lblimprimir.Text = "escogiste dolares a soles";
                        lblimprimir.Text = "El equivalente en Soles es: ";
                        resultado = soap.dolar_sol(monto);
                        txtResultado.Text = "" + Math.Round(resultado, 2);
                        break;
                    case 2:
                        //lblimprimir.Text = "escogiste soles a euros";
                        lblimprimir.Text = "El equivalente en Euros es: ";
                        resultado = soap.sol_euro(monto);
                        txtResultado.Text = "" + Math.Round(resultado, 2);
                        break;
                    case 3:
                        //lblimprimir.Text = "escogiste euros a soles";
                        lblimprimir.Text = "El equivalente en Soles es: ";
                        resultado = soap.euro_sol(monto);
                        txtResultado.Text = "" + Math.Round(resultado, 2);
                        break;
                    case 4:
                        //lblimprimir.Text = "escogiste dolares a euros ";
                        lblimprimir.Text = "El equivalente en Euros es: ";
                        resultado = soap.dolar_euro(monto);
                        txtResultado.Text = "" + Math.Round(resultado, 2);
                        break;
                    case 5:
                        //lblimprimir.Text = "escogiste euros a dolares";
                        lblimprimir.Text = "El equivalente en Dolares es: ";
                        resultado = soap.euro_dolar(monto);
                        txtResultado.Text = "" + Math.Round(resultado, 2);
                        break;                    
                }

                //txtResultado.Text = "" + indicecmb + " "+monto;


            }
            else
            {
                lblerror.Text = "Debe elegir un tipo de conversion";


            }
        }
        private void Form1_Load(object sender, EventArgs e)
        {
        cmbConversion.Items.Clear();
        cmbConversion.Items.Add("Soles a Dolares");
        cmbConversion.Items.Add("Dolares a Soles");
        cmbConversion.Items.Add("Soles a Euros");
        cmbConversion.Items.Add("Euros a Soles");
        cmbConversion.Items.Add("Dolares a Euros");
        cmbConversion.Items.Add("Euros a Dolares");
        }
    }
}
