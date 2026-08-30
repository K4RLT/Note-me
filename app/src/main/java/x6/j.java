package x6;
import d.a;
import d.b;

import a7.l;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.google.android.gms.internal.ads.zt0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import j6.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import n.q;
import w6.m;

/* loaded from: classes.dex */
public final class j extends b {
    public final StringBuilder B;
    public final RectF C;
    public final Matrix D;
    public final p6.a E;
    public final p6.a F;
    public final HashMap G;
    public final q H;
    public final ArrayList I;
    public final r6.f J;
    public final o6.j K;
    public final o6.a L;
    public final int M;
    public final r6.f N;
    public final r6.f O;
    public final r6.f P;
    public final r6.f Q;
    public final r6.f R;
    public final r6.f S;
    public final r6.f T;
    public final r6.f U;

    public j(o6.j jVar, e eVar) {
        super(jVar, eVar);
        ba.q qVar;
        ba.q qVar2;
        v6.a aVar;
        ba.q qVar3;
        v6.a aVar2;
        ba.q qVar4;
        v6.a aVar3;
        u0 u0Var;
        v6.a aVar4;
        u0 u0Var2;
        v6.b bVar;
        u0 u0Var3;
        v6.b bVar2;
        u0 u0Var4;
        v6.a aVar5;
        u0 u0Var5;
        v6.a aVar6;
        this.B = new StringBuilder(2);
        this.C = new RectF();
        this.D = new Matrix();
        p6.a aVar7 = new p6.a(1, 1);
        aVar7.setStyle(Paint.Style.FILL);
        this.E = aVar7;
        p6.a aVar8 = new p6.a(1, 2);
        aVar8.setStyle(Paint.Style.STROKE);
        this.F = aVar8;
        this.G = new HashMap();
        this.H = new q((Object) null);
        this.I = new ArrayList();
        this.M = 2;
        this.K = jVar;
        this.L = eVar.f30116b;
        r6.f fVar = new r6.f(3, (List) eVar.f30129q.f3443v);
        this.J = fVar;
        fVar.a(this);
        e(fVar);
        s sVar = eVar.f30130r;
        if (sVar != null && (u0Var5 = (u0) sVar.f18981v) != null && (aVar6 = (v6.a) u0Var5.f15036v) != null) {
            r6.e b10 = aVar6.b();
            this.N = (r6.f) b10;
            b10.a(this);
            e(b10);
        }
        if (sVar != null && (u0Var4 = (u0) sVar.f18981v) != null && (aVar5 = (v6.a) u0Var4.f15037w) != null) {
            r6.e b11 = aVar5.b();
            this.O = (r6.f) b11;
            b11.a(this);
            e(b11);
        }
        if (sVar != null && (u0Var3 = (u0) sVar.f18981v) != null && (bVar2 = (v6.b) u0Var3.f15038x) != null) {
            r6.f b12 = bVar2.b();
            this.P = b12;
            b12.a(this);
            e(b12);
        }
        if (sVar != null && (u0Var2 = (u0) sVar.f18981v) != null && (bVar = (v6.b) u0Var2.f15039y) != null) {
            r6.f b13 = bVar.b();
            this.Q = b13;
            b13.a(this);
            e(b13);
        }
        if (sVar != null && (u0Var = (u0) sVar.f18981v) != null && (aVar4 = (v6.a) u0Var.f15040z) != null) {
            r6.e b14 = aVar4.b();
            this.R = (r6.f) b14;
            b14.a(this);
            e(b14);
        }
        if (sVar != null && (qVar4 = (ba.q) sVar.f18982w) != null && (aVar3 = (v6.a) qVar4.f3158v) != null) {
            r6.e b15 = aVar3.b();
            this.S = (r6.f) b15;
            b15.a(this);
            e(b15);
        }
        if (sVar != null && (qVar3 = (ba.q) sVar.f18982w) != null && (aVar2 = (v6.a) qVar3.f3159w) != null) {
            r6.e b16 = aVar2.b();
            this.T = (r6.f) b16;
            b16.a(this);
            e(b16);
        }
        if (sVar != null && (qVar2 = (ba.q) sVar.f18982w) != null && (aVar = (v6.a) qVar2.f3160x) != null) {
            r6.e b17 = aVar.b();
            this.U = (r6.f) b17;
            b17.a(this);
            e(b17);
        }
        if (sVar != null && (qVar = (ba.q) sVar.f18982w) != null) {
            this.M = qVar.f3157u;
        }
    }

    public static void o(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public static void p(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    @Override // x6.b, q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        o6.a aVar = this.L;
        rectF.set(0.0f, 0.0f, aVar.f21792k.width(), aVar.f21792k.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x6.b
    public final void i(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        u0 u0Var;
        float f10;
        float f11;
        List list;
        int i10;
        String sb2;
        Canvas canvas2;
        Typeface createFromAsset;
        int i11;
        float f12;
        float f13;
        int i12;
        List list2;
        int i13;
        o6.j jVar;
        List list3;
        p6.a aVar;
        p6.a aVar2;
        u6.b bVar2 = (u6.b) this.J.d();
        o6.a aVar3 = this.L;
        u6.c cVar = (u6.c) aVar3.f21788f.get(bVar2.f25860b);
        if (cVar == null) {
            return;
        }
        String str = cVar.f25871b;
        String str2 = cVar.f25870a;
        canvas.save();
        canvas.concat(matrix);
        n(bVar2, i, 0);
        o6.j jVar2 = this.K;
        jVar2.getClass();
        int i14 = jVar2.f21819u.f21790h.f20940w;
        p6.a aVar4 = this.E;
        int i15 = 0;
        p6.a aVar5 = this.F;
        r6.f fVar = this.Q;
        p6.a aVar6 = aVar5;
        if (i14 > 0) {
            float f14 = 0.0f;
            float f15 = bVar2.f25861c / 100.0f;
            float[] fArr = (float[]) l.e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f16 = l.f345f;
            fArr[2] = f16;
            fArr[3] = f16;
            matrix.mapPoints(fArr);
            float f17 = f15;
            o6.j jVar3 = jVar2;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List asList = Arrays.asList(bVar2.f25859a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size = asList.size();
            float f18 = bVar2.e / 10.0f;
            if (fVar != null) {
                f18 += ((Float) fVar.d()).floatValue();
            }
            float f19 = f18;
            int i16 = 0;
            int i17 = -1;
            while (i16 < size) {
                String str3 = (String) asList.get(i16);
                PointF pointF = bVar2.f25869m;
                if (pointF == null) {
                    f12 = f14;
                } else {
                    f12 = pointF.x;
                }
                int i18 = i16;
                float f20 = f17;
                j jVar4 = this;
                List t3 = jVar4.t(str3, f12, cVar, f20, f19, true);
                int i19 = i15;
                while (i19 < t3.size()) {
                    i iVar = (i) t3.get(i19);
                    List list4 = t3;
                    int i20 = i17 + 1;
                    canvas.save();
                    int i21 = i19;
                    jVar4.s(canvas, bVar2, i20, iVar.f30139b);
                    String str4 = iVar.f30138a;
                    int i22 = i15;
                    while (i22 < str4.length()) {
                        String str5 = str4;
                        u6.d dVar = (u6.d) aVar3.f21790h.b(u6.a(str4.charAt(i22), str2, str));
                        if (dVar == null) {
                            f13 = f19;
                            i12 = i22;
                            list2 = asList;
                            i13 = size;
                            aVar = aVar6;
                            jVar = jVar3;
                        } else {
                            jVar4.n(bVar2, i, i22);
                            HashMap hashMap = jVar4.G;
                            if (hashMap.containsKey(dVar)) {
                                list3 = (List) hashMap.get(dVar);
                                f13 = f19;
                                i12 = i22;
                                list2 = asList;
                                i13 = size;
                                jVar = jVar3;
                            } else {
                                f13 = f19;
                                ArrayList arrayList = dVar.f25873a;
                                i12 = i22;
                                int size2 = arrayList.size();
                                list2 = asList;
                                ArrayList arrayList2 = new ArrayList(size2);
                                i13 = size;
                                int i23 = i15;
                                while (i23 < size2) {
                                    arrayList2.add(new q6.d(jVar3, jVar4, (m) arrayList.get(i23), aVar3));
                                    size2 = size2;
                                    i23++;
                                    arrayList = arrayList;
                                }
                                jVar = jVar3;
                                hashMap.put(dVar, arrayList2);
                                list3 = arrayList2;
                            }
                            int i24 = i15;
                            while (i24 < list3.size()) {
                                Path f21 = ((q6.d) list3.get(i24)).f();
                                List list5 = list3;
                                f21.computeBounds(jVar4.C, i15);
                                Matrix matrix2 = jVar4.D;
                                matrix2.reset();
                                matrix2.preTranslate(f14, (-bVar2.f25864g) * l.c());
                                matrix2.preScale(f20, f20);
                                f21.transform(matrix2);
                                if (bVar2.f25867k) {
                                    p(f21, aVar4, canvas);
                                    aVar2 = aVar6;
                                    p(f21, aVar2, canvas);
                                } else {
                                    aVar2 = aVar6;
                                    p(f21, aVar2, canvas);
                                    p(f21, aVar4, canvas);
                                }
                                i24++;
                                jVar4 = this;
                                aVar6 = aVar2;
                                list3 = list5;
                                i15 = 0;
                                f14 = 0.0f;
                            }
                            aVar = aVar6;
                            canvas.translate((l.c() * ((float) dVar.f25875c) * f20) + f13, 0.0f);
                        }
                        i22 = i12 + 1;
                        jVar4 = this;
                        aVar6 = aVar;
                        jVar3 = jVar;
                        str4 = str5;
                        f19 = f13;
                        asList = list2;
                        size = i13;
                        i15 = 0;
                        f14 = 0.0f;
                    }
                    canvas.restore();
                    i19 = i21 + 1;
                    jVar4 = this;
                    t3 = list4;
                    i17 = i20;
                    asList = asList;
                    size = size;
                    i15 = 0;
                    f14 = 0.0f;
                }
                i16 = i18 + 1;
                f17 = f20;
                asList = asList;
                size = size;
                i15 = 0;
                f14 = 0.0f;
            }
            canvas2 = canvas;
        } else {
            Typeface typeface = null;
            if (jVar2.getCallback() == null) {
                u0Var = null;
            } else {
                if (jVar2.f21824z == null) {
                    jVar2.f21824z = new u0(jVar2.getCallback());
                }
                u0Var = jVar2.f21824z;
            }
            if (u0Var != null) {
                zt0 zt0Var = (zt0) u0Var.f15036v;
                zt0Var.f13261b = str2;
                zt0Var.f13262c = str;
                HashMap hashMap2 = (HashMap) u0Var.f15040z;
                Typeface typeface2 = (Typeface) hashMap2.get(zt0Var);
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    HashMap hashMap3 = (HashMap) u0Var.f15037w;
                    Typeface typeface3 = (Typeface) hashMap3.get(str2);
                    if (typeface3 != null) {
                        createFromAsset = typeface3;
                    } else {
                        Typeface typeface4 = cVar.f25872c;
                        if (typeface4 != null) {
                            createFromAsset = typeface4;
                        } else {
                            createFromAsset = Typeface.createFromAsset((AssetManager) u0Var.f15038x, "fonts/" + str2 + ((String) u0Var.f15039y));
                            hashMap3.put(str2, createFromAsset);
                        }
                    }
                    boolean contains = str.contains("Italic");
                    boolean contains2 = str.contains("Bold");
                    if (contains && contains2) {
                        i11 = 3;
                    } else if (contains) {
                        i11 = 2;
                    } else if (contains2) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (createFromAsset.getStyle() != i11) {
                        createFromAsset = Typeface.create(createFromAsset, i11);
                    }
                    hashMap2.put(zt0Var, createFromAsset);
                    typeface = createFromAsset;
                }
            }
            if (typeface == null) {
                typeface = cVar.f25872c;
            }
            if (typeface != null) {
                String str6 = bVar2.f25859a;
                aVar4.setTypeface(typeface);
                float f22 = bVar2.f25861c;
                aVar4.setTextSize(l.c() * f22);
                aVar6.setTypeface(aVar4.getTypeface());
                aVar6.setTextSize(aVar4.getTextSize());
                float f23 = bVar2.e / 10.0f;
                if (fVar != null) {
                    f23 += ((Float) fVar.d()).floatValue();
                }
                float c10 = ((l.c() * f23) * f22) / 100.0f;
                List asList2 = Arrays.asList(str6.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = asList2.size();
                int i25 = 0;
                int i26 = 0;
                int i27 = -1;
                while (i25 < size3) {
                    String str7 = (String) asList2.get(i25);
                    PointF pointF2 = bVar2.f25869m;
                    if (pointF2 == null) {
                        f10 = 0.0f;
                    } else {
                        f10 = pointF2.x;
                    }
                    float f24 = c10;
                    List t10 = t(str7, f10, cVar, 0.0f, f24, false);
                    int i28 = 0;
                    while (i28 < t10.size()) {
                        i iVar2 = (i) t10.get(i28);
                        i27++;
                        canvas.save();
                        s(canvas, bVar2, i27, iVar2.f30139b);
                        String str8 = iVar2.f30138a;
                        List list6 = t10;
                        int i29 = i28;
                        int i30 = 0;
                        while (i30 < str8.length()) {
                            int codePointAt = str8.codePointAt(i30);
                            int i31 = i30;
                            int charCount = Character.charCount(codePointAt) + i30;
                            u6.c cVar2 = cVar;
                            while (true) {
                                if (charCount < str8.length()) {
                                    int codePointAt2 = str8.codePointAt(charCount);
                                    f11 = f24;
                                    if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                                        break;
                                    }
                                    charCount += Character.charCount(codePointAt2);
                                    codePointAt = (codePointAt * 31) + codePointAt2;
                                    f24 = f11;
                                } else {
                                    f11 = f24;
                                    break;
                                }
                            }
                            long j10 = codePointAt;
                            q qVar = this.H;
                            if (qVar.a(j10)) {
                                sb2 = (String) qVar.b(j10);
                                list = asList2;
                                i10 = size3;
                            } else {
                                list = asList2;
                                StringBuilder sb3 = this.B;
                                i10 = size3;
                                sb3.setLength(0);
                                int i32 = i31;
                                while (i32 < charCount) {
                                    int i33 = charCount;
                                    int codePointAt3 = str8.codePointAt(i32);
                                    sb3.appendCodePoint(codePointAt3);
                                    i32 += Character.charCount(codePointAt3);
                                    charCount = i33;
                                }
                                sb2 = sb3.toString();
                                qVar.d(j10, sb2);
                            }
                            n(bVar2, i, i26 + i31);
                            if (bVar2.f25867k) {
                                o(sb2, aVar4, canvas);
                                o(sb2, aVar6, canvas);
                            } else {
                                o(sb2, aVar6, canvas);
                                o(sb2, aVar4, canvas);
                            }
                            canvas.translate(aVar4.measureText(sb2) + f11, 0.0f);
                            i30 = sb2.length() + i31;
                            cVar = cVar2;
                            asList2 = list;
                            f24 = f11;
                            size3 = i10;
                        }
                        i26 += iVar2.f30138a.length();
                        canvas.restore();
                        i28 = i29 + 1;
                        t10 = list6;
                        cVar = cVar;
                        f24 = f24;
                    }
                    i25++;
                    cVar = cVar;
                    c10 = f24;
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void n(u6.b bVar, int i, int i10) {
        int intValue;
        p6.a aVar = this.E;
        r6.f fVar = this.N;
        if (fVar != null && r(i10)) {
            aVar.setColor(((Integer) fVar.d()).intValue());
        } else {
            aVar.setColor(bVar.f25865h);
        }
        r6.f fVar2 = this.O;
        p6.a aVar2 = this.F;
        if (fVar2 != null && r(i10)) {
            aVar2.setColor(((Integer) fVar2.d()).intValue());
        } else {
            aVar2.setColor(bVar.i);
        }
        r6.f fVar3 = (r6.f) this.f30111w.f17622k;
        int i11 = 100;
        if (fVar3 == null) {
            intValue = 100;
        } else {
            intValue = ((Integer) fVar3.d()).intValue();
        }
        r6.f fVar4 = this.R;
        if (fVar4 != null && r(i10)) {
            i11 = ((Integer) fVar4.d()).intValue();
        }
        int round = Math.round((((i11 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        aVar.setAlpha(round);
        aVar2.setAlpha(round);
        r6.f fVar5 = this.P;
        if (fVar5 != null && r(i10)) {
            aVar2.setStrokeWidth(((Float) fVar5.d()).floatValue());
        } else {
            aVar2.setStrokeWidth(l.c() * bVar.f25866j);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, x6.i] */
    public final i q(int i) {
        ArrayList arrayList = this.I;
        for (int size = arrayList.size(); size < i; size++) {
            Object obj = new Object();
            obj.f30138a = "";
            obj.f30139b = 0.0f;
            arrayList.add(obj);
        }
        return (i) arrayList.get(i - 1);
    }

    public final boolean r(int i) {
        r6.f fVar;
        int length = ((u6.b) this.J.d()).f25859a.length();
        r6.f fVar2 = this.S;
        if (fVar2 != null && (fVar = this.T) != null) {
            int min = Math.min(((Integer) fVar2.d()).intValue(), ((Integer) fVar.d()).intValue());
            int max = Math.max(((Integer) fVar2.d()).intValue(), ((Integer) fVar.d()).intValue());
            r6.f fVar3 = this.U;
            if (fVar3 != null) {
                int intValue = ((Integer) fVar3.d()).intValue();
                min += intValue;
                max += intValue;
            }
            if (this.M == 2) {
                if (i < min || i >= max) {
                    return false;
                }
                return true;
            }
            float f10 = (i / length) * 100.0f;
            if (f10 < min || f10 >= max) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean s(Canvas canvas, u6.b bVar, int i, float f10) {
        float f11;
        float f12;
        PointF pointF = bVar.f25868l;
        PointF pointF2 = bVar.f25869m;
        float c10 = l.c();
        float f13 = 0.0f;
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = (bVar.f25863f * c10) + pointF.y;
        }
        float c11 = g3.a.c(i, bVar.f25863f, c10, f11);
        this.K.getClass();
        if (pointF == null) {
            f12 = 0.0f;
        } else {
            f12 = pointF.x;
        }
        if (pointF2 != null) {
            f13 = pointF2.x;
        }
        int b10 = q0.b(bVar.f25862d);
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 2) {
                    return true;
                }
                canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), c11);
                return true;
            }
            canvas.translate((f12 + f13) - f10, c11);
            return true;
        }
        canvas.translate(f12, c11);
        return true;
    }

    public final List t(String str, float f10, u6.c cVar, float f11, float f12, boolean z3) {
        float measureText;
        int i = 0;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (z3) {
                u6.d dVar = (u6.d) this.L.f21790h.b(u6.a(charAt, cVar.f25870a, cVar.f25871b));
                if (dVar != null) {
                    measureText = (l.c() * ((float) dVar.f25875c) * f11) + f12;
                }
            } else {
                measureText = this.E.measureText(str.substring(i12, i12 + 1)) + f12;
            }
            if (charAt == ' ') {
                z9 = true;
                f15 = measureText;
            } else if (z9) {
                z9 = false;
                i11 = i12;
                f14 = measureText;
            } else {
                f14 += measureText;
            }
            f13 += measureText;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i++;
                i q10 = q(i);
                if (i11 == i10) {
                    q10.f30138a = str.substring(i10, i12).trim();
                    q10.f30139b = (f13 - measureText) - ((r10.length() - r8.length()) * f15);
                    i10 = i12;
                    i11 = i10;
                    f13 = measureText;
                    f14 = f13;
                } else {
                    q10.f30138a = str.substring(i10, i11 - 1).trim();
                    q10.f30139b = ((f13 - f14) - ((r8.length() - r14.length()) * f15)) - f15;
                    f13 = f14;
                    i10 = i11;
                }
            }
        }
        if (f13 > 0.0f) {
            i++;
            i q11 = q(i);
            q11.f30138a = str.substring(i10);
            q11.f30139b = f13;
        }
        return this.I.subList(0, i);
    }
}