package mono.com.scandit.datacapture.core.source;


public class SequenceFrameSourceProcessListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scandit.datacapture.core.source.SequenceFrameSourceProcessListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_processingFinished:([B)V:GetProcessingFinished_arrayBHandler:Scandit.DataCapture.Core.Source.ISequenceFrameSourceProcessListenerInvoker, ScanditCaptureCore\n" +
			"";
		mono.android.Runtime.register ("Scandit.DataCapture.Core.Source.ISequenceFrameSourceProcessListenerImplementor, ScanditCaptureCore", SequenceFrameSourceProcessListenerImplementor.class, __md_methods);
	}


	public SequenceFrameSourceProcessListenerImplementor ()
	{
		super ();
		if (getClass () == SequenceFrameSourceProcessListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Scandit.DataCapture.Core.Source.ISequenceFrameSourceProcessListenerImplementor, ScanditCaptureCore", "", this, new java.lang.Object[] {  });
		}
	}


	public void processingFinished (byte[] p0)
	{
		n_processingFinished (p0);
	}

	private native void n_processingFinished (byte[] p0);

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
