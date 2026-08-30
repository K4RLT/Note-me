package f4;

import a0.f0;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.d0;
import androidx.lifecycle.k;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.gms.internal.ads.zl1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i8;
import i0.m;
import j6.n;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import q.x;

/* loaded from: classes.dex */
public class d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, w, z0, k, m5.e {
    public static final Object J = new Object();
    public y A;
    public j6.c B;
    public final ArrayList C;
    public final pd.c D;
    public final c E;
    public final boolean F;
    public int G;
    public boolean H;
    public boolean I;

    /* renamed from: u, reason: collision with root package name */
    public final int f16709u = -1;

    /* renamed from: v, reason: collision with root package name */
    public final String f16710v = UUID.randomUUID().toString();

    /* renamed from: w, reason: collision with root package name */
    public final f0 f16711w = new f0();

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16712x = true;

    /* renamed from: y, reason: collision with root package name */
    public n f16713y;

    /* renamed from: z, reason: collision with root package name */
    public final p f16714z;

    public d() {
        new a(this, 1);
        this.f16714z = p.f1052y;
        new d0();
        new AtomicInteger();
        this.C = new ArrayList();
        this.D = new pd.c(this);
        this.A = new y(this, true);
        this.B = new j6.c(new o5.b(this, new a1.c(23, this)));
        ArrayList arrayList = this.C;
        pd.c cVar = this.D;
        if (!arrayList.contains(cVar)) {
            if (this.f16709u >= 0) {
                d dVar = (d) cVar.f22681u;
                ((o5.b) dVar.B.f18914v).c();
                o0.d(dVar);
            } else {
                arrayList.add(cVar);
            }
        }
        new a(this, 0);
        new b(0, this);
        this.E = new c(this);
        this.F = true;
        this.G = -1;
        new z5.h(13, this);
    }

    @Override // androidx.lifecycle.k
    public final w0 b() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.k
    public final w4.b c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.z0
    public final y0 d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final f0 e() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // m5.e
    public final m f() {
        return (m) this.B.f18915w;
    }

    @Override // androidx.lifecycle.w
    public final y g() {
        return this.A;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [f4.i, java.lang.Object] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (!this.H) {
            if (f0.B(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.I) {
                this.I = true;
                this.H = true;
                if (this.G >= 0) {
                    f0 e = e();
                    int i = this.G;
                    if (i >= 0) {
                        synchronized (((ArrayList) e.f49d)) {
                        }
                        this.G = -1;
                        return;
                    }
                    x.n(g3.a.g(i, "Bad id: "));
                    return;
                }
                i8 i8Var = new i8(e());
                Object obj = new Object();
                obj.f16718a = 3;
                obj.f16719b = this;
                ((ArrayList) i8Var.f14470d).add(obj);
                obj.f16720c = 0;
                obj.f16721d = 0;
                obj.e = 0;
                obj.f16722f = 0;
                f0 f0Var = (f0) i8Var.e;
                if (!i8Var.f14468b) {
                    if (f0.B(2)) {
                        Log.v("FragmentManager", "Commit: " + i8Var);
                        PrintWriter printWriter = new PrintWriter(new zl1());
                        ArrayList arrayList = (ArrayList) i8Var.f14470d;
                        printWriter.print("  ");
                        printWriter.print("mName=");
                        printWriter.print((String) null);
                        printWriter.print(" mIndex=");
                        printWriter.print(i8Var.f14469c);
                        printWriter.print(" mCommitted=");
                        printWriter.println(i8Var.f14468b);
                        if (!arrayList.isEmpty()) {
                            printWriter.print("  ");
                            printWriter.println("Operations:");
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                i iVar = (i) arrayList.get(i10);
                                switch (iVar.f16718a) {
                                    case 0:
                                        str = "NULL";
                                        break;
                                    case 1:
                                        str = "ADD";
                                        break;
                                    case 2:
                                        str = "REPLACE";
                                        break;
                                    case 3:
                                        str = "REMOVE";
                                        break;
                                    case 4:
                                        str = "HIDE";
                                        break;
                                    case 5:
                                        str = "SHOW";
                                        break;
                                    case 6:
                                        str = "DETACH";
                                        break;
                                    case 7:
                                        str = "ATTACH";
                                        break;
                                    case 8:
                                        str = "SET_PRIMARY_NAV";
                                        break;
                                    case 9:
                                        str = "UNSET_PRIMARY_NAV";
                                        break;
                                    case 10:
                                        str = "OP_SET_MAX_LIFECYCLE";
                                        break;
                                    default:
                                        str = "cmd=" + iVar.f16718a;
                                        break;
                                }
                                printWriter.print("  ");
                                printWriter.print("  Op #");
                                printWriter.print(i10);
                                printWriter.print(": ");
                                printWriter.print(str);
                                printWriter.print(" ");
                                printWriter.println(iVar.f16719b);
                                if (iVar.f16720c != 0 || iVar.f16721d != 0) {
                                    printWriter.print("  ");
                                    printWriter.print("enterAnim=#");
                                    printWriter.print(Integer.toHexString(iVar.f16720c));
                                    printWriter.print(" exitAnim=#");
                                    printWriter.println(Integer.toHexString(iVar.f16721d));
                                }
                                if (iVar.e != 0 || iVar.f16722f != 0) {
                                    printWriter.print("  ");
                                    printWriter.print("popEnterAnim=#");
                                    printWriter.print(Integer.toHexString(iVar.e));
                                    printWriter.print(" popExitAnim=#");
                                    printWriter.println(Integer.toHexString(iVar.f16722f));
                                }
                            }
                        }
                        printWriter.close();
                    }
                    i8Var.f14468b = true;
                    i8Var.f14469c = -1;
                    synchronized (((ArrayList) f0Var.f49d)) {
                    }
                    return;
                }
                x.o("commit already called");
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f16710v);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}