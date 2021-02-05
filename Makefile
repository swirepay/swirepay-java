.PHONY: publish

publish:
	pwd
	cd ../../ && \
	ls -ltr && \
	git clone https://${GITHUB_TOKEN}@${GITHUB_JAVA_URL} && \
	git config --global user.email "devops+github@swirepay.com" && \
	git config --global user.name "swirepay" && \
	ls -ltra && \
	pwd && \
	ls -ltr swirepay-java && \
	cd swirepay-java && \
	git branch -a && \
	git checkout ${GIT_BRANCH} && \
	git branch -a && \
	pwd && \
	ls -ltr && \
	ls -ltra ../gateway-backend/java-client/ && \
	rsync -avh ../gateway-backend/java-client/ . && \
	ls -ltra && \
	git status && \
	git add . && \
	git status && \
	git commit -m "added files on `date +'%d-%m-%Y'`" && \
	git branch -a && \
	git push -f https://${GITHUB_TOKEN}@${GITHUB_JAVA_URL} ${GIT_BRANCH}
