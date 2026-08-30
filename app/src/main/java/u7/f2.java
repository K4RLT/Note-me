package u7;
import b.c;
import b8.k1;
import f.a;
import o7.b;
import x7.f0;

import android.content.ClipData;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.widget.Toast;
import com.daren.scraply.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final pe.n f26168a = new pe.n(new fg.o(28));

    /* renamed from: b, reason: collision with root package name */
    public static final pe.n f26169b = new pe.n(new fg.o(29));

    /* renamed from: c, reason: collision with root package name */
    public static final pe.n f26170c = new pe.n(new c2(0));

    /* renamed from: d, reason: collision with root package name */
    public static final pe.n f26171d = new pe.n(new c2(1));
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    public static final void a(Context context, Intent intent, List list, String str) {
        intent.addFlags(1);
        if (!list.isEmpty()) {
            ClipData newUri = ClipData.newUri(context.getContentResolver(), str, (Uri) qe.l.w(list));
            int size = list.size();
            for (int i = 1; i < size; i++) {
                newUri.addItem(new ClipData.Item((Uri) list.get(i)));
            }
            intent.setClipData(newUri);
        }
        intent.putExtra("android.intent.extra.TITLE", str);
        Intent createChooser = Intent.createChooser(intent, str);
        createChooser.addFlags(268435456);
        context.startActivity(createChooser);
        c.g("png", 0, "share");
        sf.n0 n0Var = t7.b.f25651a;
        t7.c(context, t7.a.NOTEBOOK_SHARED);
    }

    public static final Bitmap b(HashMap hashMap, Context context, String str) {
        Bitmap bitmap;
        hashMap.getClass();
        context.getClass();
        str.getClass();
        v0 a10 = a(str);
        if (!a10.f26938a.equals("none")) {
            ConcurrentHashMap concurrentHashMap = e;
            Bitmap bitmap2 = (Bitmap) concurrentHashMap.get(str);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                return bitmap2;
            }
            if (a10.e) {
                bitmap = c();
            } else {
                String str2 = a10.f26940c;
                if (str2 != null) {
                    bitmap = e(context, str2);
                } else {
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                concurrentHashMap.put(str, bitmap);
                return bitmap;
            }
        }
        return null;
    }

    public static final Bitmap c() {
        Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        int[] iArr = new int[65536];
        Random random = new Random(7L);
        for (int i = 0; i < 65536; i++) {
            int nextInt = random.nextInt(20) + 236;
            iArr[i] = Color.rgb(nextInt, nextInt, nextInt);
        }
        createBitmap.setPixels(iArr, 0, 256, 0, 0, 256, 256);
        return createBitmap;
    }

    public static final ArrayList d(Context context, int i) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, null, null, "date_added DESC");
            if (query != null) {
                try {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                    while (query.moveToNext() && arrayList.size() < i) {
                        arrayList.add(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, query.getLong(columnIndexOrThrow)));
                    }
                    query.close();
                    return arrayList;
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static final Bitmap e(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            InputStream open = context.getAssets().open(str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(open, null, options);
                pa.a(open, null);
                if (decodeStream == null) {
                    return null;
                }
                Bitmap createBitmap = Bitmap.createBitmap(decodeStream.getWidth(), decodeStream.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                Canvas canvas = new Canvas(createBitmap);
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                colorMatrix.postConcat(new ColorMatrix(new float[]{0.45f, 0.0f, 0.0f, 0.0f, 140.0f, 0.0f, 0.45f, 0.0f, 0.0f, 140.0f, 0.0f, 0.0f, 0.45f, 0.0f, 140.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                Paint paint = new Paint();
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                canvas.drawBitmap(decodeStream, 0.0f, 0.0f, paint);
                decodeStream.recycle();
                return createBitmap;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Bitmap f(int i, Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i10 = 1;
            options.inJustDecodeBounds = true;
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    openInputStream.close();
                } finally {
                }
            }
            while (true) {
                int i11 = i * 2;
                if (options.outWidth / i10 <= i11 && options.outHeight / i10 <= i11) {
                    break;
                }
                i10 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i10;
            openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options2);
                    openInputStream.close();
                    return decodeStream;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final void g(Context context, m3 m3Var, int i, b bVar, Uri uri, b2 b2Var) {
        bVar.getClass();
        uri.getClass();
        b2Var.getClass();
        if (b2Var == b2.SCRAP) {
            m3Var.Y(context, bVar.f21848a);
        }
        ArrayList a02 = m3Var.a0(context);
        sf.n0 n0Var = f0.f30184a;
        String string = context.getString(R.string.loading_exporting);
        string.getClass();
        f0.e(string);
        wf.e eVar = pf.l0.f22767a;
        pf.b0.x(pf.b0.b(wf.d.f29913w), null, new k1(a02, b2Var, context, m3Var, i, bVar, uri, null), 3);
    }

    public static final void h(Context context) {
        pe.j jVar;
        String valueOf;
        long longVersionCode;
        context.getClass();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
                valueOf = String.valueOf(longVersionCode);
            } else {
                valueOf = String.valueOf(packageInfo.versionCode);
            }
            String str = packageInfo.versionName;
            if (str == null) {
                str = "?";
            }
            jVar = new pe.j(str, valueOf);
        } catch (Exception unused) {
            jVar = new pe.j("?", "?");
        }
        String str2 = (String) jVar.f22693u;
        String str3 = (String) jVar.f22694v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R.string.feedback_body_hint));
        sb2.append("\n\n\n\n\n――――――――――――――――――――\n");
        sb2.append(context.getString(R.string.feedback_tech_header));
        sb2.append('\n');
        sb2.append("Scraply " + str2 + " (" + str3 + ")\n");
        sb2.append(Build.MANUFACTURER + " " + Build.MODEL + "\n");
        sb2.append("Android " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ")");
        String sb3 = sb2.toString();
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"apis.revisor@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.feedback_subject));
        intent.putExtra("android.intent.extra.TEXT", sb3);
        try {
            context.startActivity(intent);
        } catch (Exception unused2) {
            Toast.makeText(context, R.string.feedback_no_email_app, 0).show();
        }
    }
}
