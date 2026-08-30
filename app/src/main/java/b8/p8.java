package b8;
import b0.x;
import d.i;
import f2.b;
import k1.l0;
import o0.h;
import o7.b;
import r0.a1;
import r0.e1;
import r0.f1;
import t7.a;
import t7.b;
import u7.a3;
import u7.k6;
import u7.l2;
import u7.m3;
import u7.o1;
import u7.v1;
import u7.w1;
import u7.w4;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.daren.scraply.R;
import com.daren.scraply.ui.canvas.CameraKeepAliveService;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class p8 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2529u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2530v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2531w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2532x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2533y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2534z;

    public /* synthetic */ p8(q.d dVar, o1 o1Var, q.d dVar2, a1 a1Var, a1 a1Var2) {
        this.f2529u = 4;
        this.f2530v = dVar;
        this.f2533y = o1Var;
        this.f2534z = dVar2;
        this.f2531w = a1Var;
        this.f2532x = a1Var2;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        Uri uri;
        int i;
        String str2;
        String lastPathSegment;
        int i10 = this.f2529u;
        int i11 = -1;
        boolean z3 = false;
        pe.z zVar = pe.z.f22715a;
        Object obj = this.f2534z;
        Object obj2 = this.f2533y;
        Object obj3 = this.f2532x;
        Object obj4 = this.f2531w;
        Object obj5 = this.f2530v;
        switch (i10) {
            case 0:
                ((df.r) obj5).d(mf.f.I((String) ((a1) obj4).getValue()).toString(), mf.f.I((String) ((a1) obj3).getValue()).toString(), (String) ((a1) obj2).getValue(), (String) ((a1) obj).getValue());
                return zVar;
            case 1:
                List list = (List) obj5;
                o1 o1Var = (o1) obj4;
                m3 m3Var = (m3) obj2;
                Context context = (Context) obj;
                int b10 = ff.a.b(((Number) ((q.d) obj3).e.getValue()).floatValue());
                int[] iArr = (int[]) qe.k.o(o1Var.i().e, o1Var.k());
                if (iArr != null && b10 >= 0 && b10 < iArr.length) {
                    i11 = iArr[b10];
                }
                b bVar = (b) qe.l.y(i11, list);
                if (bVar != null) {
                    str = bVar.f21848a;
                } else {
                    str = null;
                }
                List list2 = v1.f26945d;
                gf.c cVar = gf.d.f17754u;
                w1 w1Var = (w1) qe.l.G(list2);
                String string = context.getString(R.string.notebook_default_title);
                string.getClass();
                pf.x(androidx.lifecycle.h(m3Var), null, new a3(m3Var, string, l0.c(w1Var.f26987b), str, context, Integer.valueOf(w1Var.f26986a), null), 3);
                sf.n0 n0Var = b.f25651a;
                b.c(context, a.NOTEBOOK_CREATED);
                return zVar;
            case 2:
                pf.x((pf.z) obj5, null, new l2((m3) obj4, (Context) obj3, (q.d) obj2, (f1) obj, (te.c) null), 3);
                return zVar;
            case 3:
                pf.z zVar2 = (pf.z) obj5;
                pf.x(zVar2, null, new w4((q.d) obj4, (q.d) obj3, zVar2, (l2) obj2, (f1) obj, null, 1), 3);
                return zVar;
            case 4:
                o1 o1Var2 = (o1) obj2;
                q.d dVar = (q.d) obj;
                a1 a1Var = (a1) obj4;
                a1 a1Var2 = (a1) obj3;
                if (((Number) ((q.d) obj5).e()).floatValue() > 0.5f && ((Number) o1Var2.f26660p.e()).floatValue() > 0.5f) {
                    float f10 = k6.f26414a;
                    if (!((Boolean) a1Var2.getValue()).booleanValue() && ((Number) dVar.e()).floatValue() < 0.1f && !((Boolean) a1Var.getValue()).booleanValue()) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 5:
                w7.d dVar2 = (w7.d) obj5;
                Context context2 = (Context) obj3;
                df.a aVar = (df.a) obj2;
                i iVar = (i) obj;
                a1 a1Var3 = (a1) obj4;
                if (((w7.c) dVar2.f28051a.getValue()) == w7.c.IDLE) {
                    try {
                        File file = new File(context2.getCacheDir(), "camera");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            for (File file2 : listFiles) {
                                file2.delete();
                            }
                        }
                        uri = FileProvider.d(context2, new File(file, "shot_" + UUID.randomUUID() + ".jpg"));
                    } catch (Exception e) {
                        e.printStackTrace();
                        uri = null;
                    }
                    if (uri == null) {
                        Toast.makeText(context2, context2.getString(R.string.error_no_camera_app), 1).show();
                    } else {
                        a1Var3.setValue(uri);
                        w7.b bVar2 = (w7.b) aVar.invoke();
                        context2.getClass();
                        if (bVar2 == null || (str2 = bVar2.f27912a) == null || (lastPathSegment = uri.getLastPathSegment()) == null) {
                            i = 1;
                        } else {
                            i = 1;
                            int lastIndexOf = lastPathSegment.lastIndexOf(47, lastPathSegment.length() - 1);
                            if (lastIndexOf != -1) {
                                lastPathSegment = lastPathSegment.substring(lastIndexOf + 1, lastPathSegment.length());
                            }
                            context2.getSharedPreferences("scraply_camera_rescue", 0).edit().putString("shot_name", lastPathSegment).putString("notebook_id", str2).putInt("spread_index", bVar2.f27913b).apply();
                        }
                        int i12 = CameraKeepAliveService.f4158v;
                        try {
                            Intent intent = new Intent(context2, (Class<?>) CameraKeepAliveService.class);
                            if (Build.VERSION.SDK_INT >= 26) {
                                b.m(context2, intent);
                            } else {
                                context2.startService(intent);
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        try {
                            iVar.a(uri);
                            dVar2.f28052b.setValue(Boolean.FALSE);
                            dVar2.a(w7.c.CLOSING);
                        } catch (ActivityNotFoundException unused) {
                            a1Var3.setValue(null);
                            int i13 = CameraKeepAliveService.f4158v;
                            w7.n4.x1(context2);
                            context2.getSharedPreferences("scraply_camera_rescue", 0).edit().clear().apply();
                            w7.n4.e1(context2, uri);
                            Toast.makeText(context2, context2.getString(R.string.error_no_camera_app), i).show();
                        }
                    }
                }
                return zVar;
            default:
                df.a aVar2 = (df.a) obj5;
                pf.z zVar3 = (pf.z) obj4;
                e1 e1Var = (e1) obj3;
                e1 e1Var2 = (e1) obj2;
                e1 e1Var3 = (e1) obj;
                if (e1Var.h() <= 1.001f && e1Var2.h() == 0.0f && e1Var3.h() == 0.0f) {
                    aVar2.invoke();
                } else {
                    pf.x(zVar3, null, new l2(aVar2, e1Var, e1Var2, e1Var3, (te.c) null, 29), 3);
                }
                return zVar;
        }
    }

    public /* synthetic */ p8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f2529u = i;
        this.f2530v = obj;
        this.f2531w = obj2;
        this.f2532x = obj3;
        this.f2533y = obj4;
        this.f2534z = obj5;
    }

    public /* synthetic */ p8(w7.d dVar, Context context, df.a aVar, i iVar, a1 a1Var) {
        this.f2529u = 5;
        this.f2530v = dVar;
        this.f2532x = context;
        this.f2533y = aVar;
        this.f2534z = iVar;
        this.f2531w = a1Var;
    }
}
