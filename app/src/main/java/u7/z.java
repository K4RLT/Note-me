package u7;
import k1.b;
import m1.d;
import z.e;
import z0.c;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.List;
import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27075u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27076v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27077w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f27078x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f27079y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f27080z;

    public /* synthetic */ z(int i, String str, String str2, String str3, Typeface typeface) {
        this.f27076v = i;
        this.f27077w = str;
        this.f27078x = str2;
        this.f27079y = str3;
        this.f27080z = typeface;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f27075u) {
            case 0:
                List list = (List) this.f27077w;
                v7.d dVar = (v7.d) this.f27078x;
                m3 m3Var = (m3) this.f27079y;
                Context context = (Context) this.f27080z;
                e eVar = (e) obj;
                eVar.getClass();
                e.p(eVar, list.size() + 1, null, new c(-205278407, new d0(list, dVar, m3Var, this.f27076v, context), true), 6);
                return pe.z.f22715a;
            default:
                String str = (String) this.f27077w;
                String str2 = (String) this.f27078x;
                String str3 = (String) this.f27079y;
                Typeface typeface = (Typeface) this.f27080z;
                d dVar2 = (d) obj;
                dVar2.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar2.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.e() & 4294967295L));
                float f10 = intBitsToFloat / 2.0f;
                float f11 = intBitsToFloat2 / 2.0f;
                int i = this.f27076v;
                if (i == -1) {
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    paint.setTextAlign(Paint.Align.CENTER);
                    paint.setTextSize(dVar2.D0(ae.e(11)));
                    float f12 = intBitsToFloat * 0.88f;
                    float max = Math.max(paint.measureText(str), paint.measureText(str2));
                    if (max > f12 && max > 0.0f) {
                        paint.setTextSize((f12 / max) * paint.getTextSize());
                    }
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    float f13 = fontMetrics.descent;
                    float f14 = fontMetrics.ascent;
                    float f15 = f13 - f14;
                    float f16 = (f11 - f15) - f14;
                    b.a(dVar2.p0().j()).drawText(str, f10, f16, paint);
                    b.a(dVar2.p0().j()).drawText(str2, f10, f16 + f15, paint);
                } else {
                    z0.b(b.a(dVar2.p0().j()), intBitsToFloat, intBitsToFloat2, str3, i, typeface);
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ z(List list, v7.d dVar, m3 m3Var, int i, Context context) {
        this.f27077w = list;
        this.f27078x = dVar;
        this.f27079y = m3Var;
        this.f27076v = i;
        this.f27080z = context;
    }
}
