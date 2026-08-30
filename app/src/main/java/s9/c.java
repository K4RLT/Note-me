package s9;
import r.e;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.ku;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.xs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.a0;

/* loaded from: classes.dex */
public final class c implements s81 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25051u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ku f25052v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f25053w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f25054x;

    public /* synthetic */ c(i iVar, ku kuVar, boolean z3, int i) {
        this.f25051u = i;
        this.f25052v = kuVar;
        this.f25053w = z3;
        this.f25054x = iVar;
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public final void mo202r(Object obj) {
        int i = this.f25051u;
        boolean z3 = this.f25053w;
        i iVar = this.f25054x;
        ku kuVar = this.f25052v;
        switch (i) {
            case 0:
                List<Uri> list = (List) obj;
                try {
                    iVar.getClass();
                    ArrayList arrayList = iVar.S;
                    ArrayList arrayList2 = iVar.R;
                    xs0 xs0Var = iVar.G;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (i.z4((Uri) it.next(), arrayList2, arrayList)) {
                                iVar.N.getAndIncrement();
                            }
                        }
                    }
                    iu iuVar = (iu) kuVar;
                    Parcel g22 = iuVar.g2();
                    g22.writeTypedList(list);
                    iuVar.v2(g22, 1);
                    if (iVar.I || z3) {
                        for (Uri uri : list) {
                            if (i.z4(uri, arrayList2, arrayList)) {
                                xs0Var.b(i.C4(uri, iVar.Q, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) g9.e.f17698c.a(sl.f10953t8)).booleanValue()) {
                                    xs0Var.b(uri.toString(), null, null, null);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    int i10 = a0.f19634b;
                    l9.i.d("", e);
                    return;
                }
            default:
                ArrayList arrayList3 = (ArrayList) obj;
                try {
                    iu iuVar2 = (iu) kuVar;
                    Parcel g23 = iuVar2.g2();
                    g23.writeTypedList(arrayList3);
                    iuVar2.v2(g23, 1);
                    boolean z9 = iVar.H;
                    xs0 xs0Var2 = iVar.G;
                    if (z9 || z3) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = arrayList3.get(i11);
                            i11++;
                            Uri uri2 = (Uri) obj2;
                            if (i.z4(uri2, iVar.T, iVar.U)) {
                                xs0Var2.b(i.C4(uri2, iVar.Q, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) g9.e.f17698c.a(sl.f10953t8)).booleanValue()) {
                                    xs0Var2.b(uri2.toString(), null, null, null);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (RemoteException e8) {
                    int i12 = a0.f19634b;
                    l9.i.d("", e8);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public final void t(Throwable th) {
        int i = this.f25051u;
        ku kuVar = this.f25052v;
        switch (i) {
            case 0:
                try {
                    String message = th.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message);
                    String sb3 = sb2.toString();
                    iu iuVar = (iu) kuVar;
                    Parcel g22 = iuVar.g2();
                    g22.writeString(sb3);
                    iuVar.v2(g22, 2);
                    return;
                } catch (RemoteException e) {
                    int i10 = a0.f19634b;
                    l9.i.d("", e);
                    return;
                }
            default:
                try {
                    String message2 = th.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb4.append("Internal error: ");
                    sb4.append(message2);
                    String sb5 = sb4.toString();
                    iu iuVar2 = (iu) kuVar;
                    Parcel g23 = iuVar2.g2();
                    g23.writeString(sb5);
                    iuVar2.v2(g23, 2);
                    return;
                } catch (RemoteException e8) {
                    int i11 = a0.f19634b;
                    l9.i.d("", e8);
                    return;
                }
        }
    }
}
