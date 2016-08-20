package space.mindhack.basicWeaponsMod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable {
    // TODO Increase bullet velocity
    // FIXME Entity textures

    public EntityBullet(World world) {
        super(world);
    }

    public EntityBullet(World world, EntityLivingBase entityLivingBase)
    {
        super(world, entityLivingBase);
    }

    @Override
    protected float getGravityVelocity() {
        return 0F;
    }

    @Override
    protected void onImpact(MovingObjectPosition movingObjectPosition) {
        if (movingObjectPosition.entityHit != null) {
            movingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 4);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
