package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.attachment.Attachment;

public interface IAttachmentRepository extends Repository<Attachment,Long>{

			@Override
			Result<Attachment> findAll() throws Exception;
			
			@Override
			Attachment findById(Long id) throws Exception;
			
			@Override
			void remove(Long id) throws Exception;
			
			@Override
			Attachment save(Attachment entity) throws Exception;
}
