using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace MatrixScanBubbleSample.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class StockOverlay : ContentView
    {
        public StockOverlay(string barcode, int shelfCount, int backRoom)
        {
            this.InitializeComponent();
            this.StockCountImage.BackgroundColor = Color.FromRgba(0.35, 0.84, 0.78, 1);

            this.Barcode.Text = barcode;
            this.Description.Text = string.Format("Shelf: {0} Back room: {1}", shelfCount, backRoom);

            this.HeightRequest = 50;
            this.WidthRequest = 250;
        }

        private void TapGestureRecognizerTapped(object sender, System.EventArgs e)
        {
            this.Title.IsVisible = !this.Title.IsVisible;
            this.Description.IsVisible = !this.Description.IsVisible;
            this.Barcode.IsVisible = !this.Barcode.IsVisible;
        }
    }
}