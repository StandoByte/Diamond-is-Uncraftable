package io.github.halffocused.diamond_is_uncraftable.client.entity.model;

import io.github.halffocused.diamond_is_uncraftable.DiamondIsUncraftable;
import io.github.halffocused.diamond_is_uncraftable.capability.Stand;
import io.github.halffocused.diamond_is_uncraftable.config.JojoBizarreSurvivalConfig;
import io.github.halffocused.diamond_is_uncraftable.entity.stand.TheWorldEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import java.util.concurrent.atomic.AtomicReference;

public class TheWorldModel extends AnimatedGeoModel {

    @Override
    public ResourceLocation getAnimationFileLocation(Object entity) {
        return new ResourceLocation(DiamondIsUncraftable.MOD_ID, "animations/theworld.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(Object entity) {
        return new ResourceLocation(DiamondIsUncraftable.MOD_ID, "geo/theworld.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object entity) {


        AtomicReference<ResourceLocation> returnValue = new AtomicReference<>();
        returnValue.set(new ResourceLocation(DiamondIsUncraftable.MOD_ID, "textures/stands/the_world.png"));

        if(entity instanceof TheWorldEntity) {
            Stand.getLazyOptional(((TheWorldEntity) entity).getMaster()).ifPresent(props -> {

                if (props.getAbilityActive() && !JojoBizarreSurvivalConfig.CLIENT.reducedFlashes.get()) {
                    returnValue.set(new ResourceLocation(DiamondIsUncraftable.MOD_ID, "textures/stands/the_world_invert.png"));
                }else{
                    returnValue.set(new ResourceLocation(DiamondIsUncraftable.MOD_ID, "textures/stands/the_world.png"));
                }


            });

            return returnValue.get();
        }

        return new ResourceLocation(DiamondIsUncraftable.MOD_ID, "textures/stands/the_world.png");
    }

    @Override
    public void setLivingAnimations(IAnimatable entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
    }


}