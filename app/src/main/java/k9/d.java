package k9;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19667b;

    public d(i iVar, Context context) {
        this.f19666a = 2;
        this.f19667b = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f19666a) {
            case 0:
                ((AtomicInteger) this.f19667b).set(i);
                return;
            case 1:
                ((g) this.f19667b).b();
                return;
            default:
                f0 f0Var = f9.k.C.f16813c;
                f0.t((Context) this.f19667b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                return;
        }
    }

    public /* synthetic */ d(int i, Object obj) {
        this.f19666a = i;
        this.f19667b = obj;
    }
}
