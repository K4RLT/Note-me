package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class hy extends iy implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap N;
    public int A;
    public int B;
    public MediaPlayer C;
    public Uri D;
    public int E;
    public int F;
    public int G;
    public py H;
    public final boolean I;
    public int J;
    public ly K;
    public boolean L;
    public Integer M;

    /* renamed from: w, reason: collision with root package name */
    public final h00 f6922w;

    /* renamed from: x, reason: collision with root package name */
    public final ry f6923x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f6924y;

    /* renamed from: z, reason: collision with root package name */
    public final be0 f6925z;

    static {
        HashMap hashMap = new HashMap();
        N = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public hy(Context context, h00 h00Var, boolean z3, boolean z9, ry ryVar, be0 be0Var) {
        super(context);
        this.A = 0;
        this.B = 0;
        this.L = false;
        this.M = null;
        this.f6922w = h00Var;
        this.f6923x = ryVar;
        this.I = z3;
        this.f6924y = z9;
        ryVar.a(this);
        this.f6925z = be0Var;
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        be0 be0Var;
        k9.a0.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.D != null && surfaceTexture2 != null) {
            E(false);
            try {
                eb.w wVar = f9.k.C.f16829u;
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.C = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.C.setOnCompletionListener(this);
                this.C.setOnErrorListener(this);
                this.C.setOnInfoListener(this);
                this.C.setOnPreparedListener(this);
                this.C.setOnVideoSizeChangedListener(this);
                this.G = 0;
                if (this.I) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.Qe)).booleanValue() && (be0Var = this.f6925z) != null) {
                        j6.s a10 = be0Var.a();
                        a10.k("action", "svp_ampv");
                        a10.l();
                    }
                    py pyVar = new py(getContext());
                    this.H = pyVar;
                    int width = getWidth();
                    int height = getHeight();
                    pyVar.G = width;
                    pyVar.F = height;
                    pyVar.I = surfaceTexture2;
                    py pyVar2 = this.H;
                    pyVar2.start();
                    if (pyVar2.I == null) {
                        surfaceTexture = null;
                    } else {
                        try {
                            pyVar2.N.await();
                        } catch (InterruptedException unused) {
                        }
                        surfaceTexture = pyVar2.H;
                    }
                    if (surfaceTexture != null) {
                        surfaceTexture2 = surfaceTexture;
                    } else {
                        this.H.b();
                        this.H = null;
                    }
                }
                this.C.setDataSource(getContext(), this.D);
                this.C.setSurface(new Surface(surfaceTexture2));
                this.C.setAudioStreamType(3);
                this.C.setScreenOnWhilePlaying(true);
                this.C.prepareAsync();
                G(1);
            } catch (IOException e) {
                e = e;
                l9.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.D)), e);
                onError(this.C, 1, 0);
            } catch (IllegalArgumentException e8) {
                e = e8;
                l9.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.D)), e);
                onError(this.C, 1, 0);
            } catch (IllegalStateException e10) {
                e = e10;
                l9.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.D)), e);
                onError(this.C, 1, 0);
            }
        }
    }

    public final void E(boolean z3) {
        k9.a0.k("AdMediaPlayerView release");
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.b();
            this.H = null;
        }
        MediaPlayer mediaPlayer = this.C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.C.release();
            this.C = null;
            G(0);
            if (z3) {
                this.B = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.C == null || (i = this.A) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        sy syVar = this.f7252v;
        ry ryVar = this.f6923x;
        if (i == 3) {
            ryVar.d();
            syVar.f11196d = true;
            syVar.a();
        } else if (this.A == 3) {
            ryVar.f10347m = false;
            syVar.f11196d = false;
            syVar.a();
        }
        this.A = i;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final String d() {
        return "MediaPlayer".concat(true != this.I ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void e(ly lyVar) {
        this.K = lyVar;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void f(String str) {
        Uri parse = Uri.parse(str);
        dj a10 = dj.a(parse);
        if (a10 != null && a10.f5436u == null) {
            return;
        }
        if (a10 != null) {
            parse = Uri.parse(a10.f5436u);
        }
        this.D = parse;
        this.J = 0;
        D();
        requestLayout();
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void g() {
        k9.a0.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.C;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.C.release();
            this.C = null;
            G(0);
            this.B = 0;
        }
        this.f6923x.b();
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void h() {
        k9.a0.k("AdMediaPlayerView play");
        if (F()) {
            this.C.start();
            G(3);
            this.f7251u.f8892c = true;
            k9.f0.f19676l.post(new fy(this, 3));
        }
        this.B = 3;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void i() {
        k9.a0.k("AdMediaPlayerView pause");
        if (F() && this.C.isPlaying()) {
            this.C.pause();
            G(4);
            k9.f0.f19676l.post(new fy(this, 4));
        }
        this.B = 4;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int j() {
        if (F()) {
            return this.C.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int k() {
        if (F()) {
            return this.C.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void l(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 23);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i);
        k9.a0.k(sb2.toString());
        if (F()) {
            this.C.seekTo(i);
            this.J = 0;
        } else {
            this.J = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void m(float f10, float f11) {
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.c(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int n() {
        MediaPlayer mediaPlayer = this.C;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int o() {
        MediaPlayer mediaPlayer = this.C;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.G = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        k9.a0.k("AdMediaPlayerView completion");
        G(5);
        this.B = 5;
        k9.f0.f19676l.post(new fy(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i10) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = N;
        String str = (String) hashMap.get(valueOf);
        String str2 = (String) hashMap.get(Integer.valueOf(i10));
        String l10 = a5.a.l(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i11 = k9.a0.f19634b;
        l9.i.f(l10);
        G(-1);
        this.B = -1;
        k9.f0.f19676l.post(new r1(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i10) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = N;
        String str = (String) hashMap.get(valueOf);
        String str2 = (String) hashMap.get(Integer.valueOf(i10));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        k9.a0.k(sb2.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r1 > r6) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.E
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.F
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.E
            if (r2 <= 0) goto L79
            int r2 = r5.F
            if (r2 <= 0) goto L79
            com.google.android.gms.internal.ads.py r2 = r5.H
            if (r2 != 0) goto L79
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.E
            int r1 = r0 * r7
            int r2 = r5.F
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L79
        L3c:
            if (r1 <= r3) goto L61
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L79
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.F
            int r0 = r0 * r6
            int r2 = r5.E
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L61
        L52:
            r1 = r0
            goto L40
        L54:
            int r4 = r5.E
            if (r1 != r2) goto L65
            int r4 = r4 * r7
            int r1 = r5.F
            int r1 = r4 / r1
            if (r0 != r3) goto L63
            if (r1 <= r6) goto L63
        L61:
            r0 = r6
            goto L3a
        L63:
            r0 = r1
            goto L3a
        L65:
            int r2 = r5.F
            if (r1 != r3) goto L6f
            if (r2 <= r7) goto L6f
            int r1 = r7 * r4
            int r1 = r1 / r2
            goto L71
        L6f:
            r7 = r2
            r1 = r4
        L71:
            if (r0 != r3) goto L63
            if (r1 <= r6) goto L63
            int r2 = r2 * r6
            int r1 = r2 / r4
            goto L40
        L79:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.py r6 = r5.H
            if (r6 == 0) goto L83
            r6.a(r0, r1)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hy.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        k9.a0.k("AdMediaPlayerView prepared");
        G(2);
        ry ryVar = this.f6923x;
        if (ryVar.i && !ryVar.f10344j) {
            an1.j(ryVar.e, ryVar.f10340d, "vfr2");
            ryVar.f10344j = true;
        }
        k9.f0.f19676l.post(new ac.a(8, this, mediaPlayer, false));
        this.E = mediaPlayer.getVideoWidth();
        this.F = mediaPlayer.getVideoHeight();
        int i = this.J;
        if (i != 0) {
            l(i);
        }
        if (this.f6924y && F() && this.C.getCurrentPosition() > 0 && this.B != 3) {
            k9.a0.k("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.C;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                l9.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.C.start();
            int currentPosition = this.C.getCurrentPosition();
            f9.k.C.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (F() && this.C.getCurrentPosition() == currentPosition) {
                f9.k.C.f16819k.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.C.pause();
            t();
        }
        int i10 = this.E;
        int i11 = this.F;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40 + String.valueOf(i11).length());
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        l9.i.e(sb2.toString());
        if (this.B == 3) {
            h();
        }
        t();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        k9.a0.k("AdMediaPlayerView surface created");
        D();
        k9.f0.f19676l.post(new fy(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k9.a0.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.C;
        if (mediaPlayer != null && this.J == 0) {
            this.J = mediaPlayer.getCurrentPosition();
        }
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.b();
        }
        k9.f0.f19676l.post(new fy(this, 2));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        k9.a0.k("AdMediaPlayerView surface changed");
        int i11 = this.B;
        boolean z3 = false;
        if (this.E == i && this.F == i10) {
            z3 = true;
        }
        if (this.C != null && i11 == 3 && z3) {
            int i12 = this.J;
            if (i12 != 0) {
                l(i12);
            }
            h();
        }
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.a(i, i10);
        }
        k9.f0.f19676l.post(new gy(this, i, i10, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f6923x.c(this);
        this.f7251u.a(surfaceTexture, this.K);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i10).length());
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i);
        sb2.append(" x ");
        sb2.append(i10);
        k9.a0.k(sb2.toString());
        this.E = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.F = videoHeight;
        if (this.E != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 47);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i);
        k9.a0.k(sb2.toString());
        k9.f0.f19676l.post(new c4.i(this, i, 4));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long p() {
        if (this.M != null) {
            return (r() * this.G) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long q() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long r() {
        if (this.M != null) {
            return j() * this.M.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int s() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT >= 26 && F()) {
            metrics = this.C.getMetrics();
            return metrics.getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void t() {
        float f10;
        sy syVar = this.f7252v;
        float f11 = 0.0f;
        if (syVar.e) {
            f10 = 0.0f;
        } else {
            f10 = syVar.f11197f;
        }
        if (syVar.f11195c) {
            f11 = f10;
        }
        MediaPlayer mediaPlayer = this.C;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f11, f11);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = k9.a0.f19634b;
            l9.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = hy.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return p.a.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }
}
