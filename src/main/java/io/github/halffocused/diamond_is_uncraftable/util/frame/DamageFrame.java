package io.github.halffocused.diamond_is_uncraftable.util.frame;

import net.minecraft.util.math.Vec3d;

public class DamageFrame {

    int tick;
    float damage;
    Vec3d motion;
    double hitboxRange;
    int pierce;
    boolean blockable;

    public DamageFrame(int tickIn, float damageIn, Vec3d motionIn, double hitboxRangeIn, int pierceIn, boolean blockableIn) {
        super();
        tick = tickIn;
        damage = damageIn;
        motion = motionIn;
        hitboxRange = hitboxRangeIn;
        pierce = pierceIn;
        blockable = blockableIn;
    }

    public int getTick(){
        return tick;
    }

    public float getDamage(){
        return damage;
    }

    public Vec3d getMotion(){
        return motion;
    }

    public double getHitboxRange(){
        return hitboxRange;
    }

    public int getPierce(){
        return pierce;
    }

    public boolean getBlockable(){
        return blockable;
    }

}
