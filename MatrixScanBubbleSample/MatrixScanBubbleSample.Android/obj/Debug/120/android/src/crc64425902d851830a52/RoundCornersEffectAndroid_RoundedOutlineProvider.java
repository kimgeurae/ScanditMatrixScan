package crc64425902d851830a52;


public class RoundCornersEffectAndroid_RoundedOutlineProvider
	extends android.view.ViewOutlineProvider
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getOutline:(Landroid/view/View;Landroid/graphics/Outline;)V:GetGetOutline_Landroid_view_View_Landroid_graphics_Outline_Handler\n" +
			"";
		mono.android.Runtime.register ("MatrixScanBubbleSample.Droid.Effects.RoundCornersEffectAndroid+RoundedOutlineProvider, MatrixScanBubbleSample.Android", RoundCornersEffectAndroid_RoundedOutlineProvider.class, __md_methods);
	}


	public RoundCornersEffectAndroid_RoundedOutlineProvider ()
	{
		super ();
		if (getClass () == RoundCornersEffectAndroid_RoundedOutlineProvider.class) {
			mono.android.TypeManager.Activate ("MatrixScanBubbleSample.Droid.Effects.RoundCornersEffectAndroid+RoundedOutlineProvider, MatrixScanBubbleSample.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public RoundCornersEffectAndroid_RoundedOutlineProvider (double p0)
	{
		super ();
		if (getClass () == RoundCornersEffectAndroid_RoundedOutlineProvider.class) {
			mono.android.TypeManager.Activate ("MatrixScanBubbleSample.Droid.Effects.RoundCornersEffectAndroid+RoundedOutlineProvider, MatrixScanBubbleSample.Android", "System.Double, mscorlib", this, new java.lang.Object[] { p0 });
		}
	}


	public void getOutline (android.view.View p0, android.graphics.Outline p1)
	{
		n_getOutline (p0, p1);
	}

	private native void n_getOutline (android.view.View p0, android.graphics.Outline p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
