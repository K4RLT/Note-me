package j7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import pe.z;
import ya.e0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18992u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18993v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f18994w;

    public /* synthetic */ c(String str, int i) {
        this.f18992u = 0;
        this.f18994w = str;
        this.f18993v = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.l
    public final Object invoke(Object obj) {
        p5.c T;
        switch (this.f18992u) {
            case 0:
                String str = this.f18994w;
                int i = this.f18993v;
                p5.a aVar = (p5.a) obj;
                aVar.getClass();
                T = aVar.T("SELECT * FROM canvas_elements WHERE notebookId = ? AND spreadIndex = ? ORDER BY zIndex ASC, createdAt ASC");
                try {
                    T.s(1, str);
                    T.b(2, i);
                    int b10 = e0.b(T, FacebookMediationAdapter.KEY_ID);
                    int b11 = e0.b(T, "notebookId");
                    int b12 = e0.b(T, "spreadIndex");
                    int b13 = e0.b(T, "pageSide");
                    int b14 = e0.b(T, "type");
                    int b15 = e0.b(T, "zIndex");
                    int b16 = e0.b(T, "x");
                    int b17 = e0.b(T, "y");
                    int b18 = e0.b(T, "scale");
                    int b19 = e0.b(T, "rotation");
                    int b20 = e0.b(T, "payload");
                    int b21 = e0.b(T, "createdAt");
                    ArrayList arrayList = new ArrayList();
                    while (T.P()) {
                        int i10 = b10;
                        arrayList.add(new k7.c(T.D(b10), T.D(b11), (int) T.getLong(b12), (int) T.getLong(b13), T.D(b14), (int) T.getLong(b15), (float) T.getDouble(b16), (float) T.getDouble(b17), (float) T.getDouble(b18), (float) T.getDouble(b19), T.D(b20), T.getLong(b21)));
                        b10 = i10;
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                int i11 = this.f18993v;
                String str2 = this.f18994w;
                p5.a aVar2 = (p5.a) obj;
                aVar2.getClass();
                T = aVar2.T("UPDATE notebooks SET orderIndex = ? WHERE id = ?");
                try {
                    T.b(1, i11);
                    T.s(2, str2);
                    T.P();
                    T.close();
                    return z.f22715a;
                } finally {
                }
            default:
                int i12 = this.f18993v;
                String str3 = this.f18994w;
                p5.a aVar3 = (p5.a) obj;
                aVar3.getClass();
                T = aVar3.T("UPDATE stacks SET orderIndex = ? WHERE id = ?");
                try {
                    T.b(1, i12);
                    T.s(2, str3);
                    T.P();
                    return z.f22715a;
                } finally {
                }
        }
    }

    public /* synthetic */ c(String str, int i, int i10) {
        this.f18992u = i10;
        this.f18993v = i;
        this.f18994w = str;
    }
}
